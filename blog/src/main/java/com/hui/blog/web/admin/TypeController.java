package com.hui.blog.web.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.blog.bean.Tag;
import com.hui.blog.bean.Type;
import com.hui.blog.commons.Msg;
import com.hui.blog.exception.CustomizeErrorCode;
import com.hui.blog.service.TypeSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/17
 */

@CrossOrigin("*")
@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeSerivce typeSerivce;

    /**
     * 添加逻辑,先查询,在添加
     * @return
     */
    @PostMapping("/saveType")
    @ResponseBody
    public Msg saveType(Type type){
        Type getType = typeSerivce.getType(type.getName());
        if (getType==null){
            int i = typeSerivce.saveType(type);
            if (i > 0) {
                return Msg.success().add("success", "添加分类成功!!!");
            } else {
                return Msg.fail().add("error", "添加分类失败!!!");
            }
        } else {
            return Msg.fail().add("error", "该分类已经存在,不能重复添加!");
        }
    }

    /**
     * 排序分页
     * @param pageNum
     * @return
     */
    @GetMapping("/typeList")
    @ResponseBody
    public Msg listType(@RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        //设置每页大小
        PageHelper.startPage(pageNum, 5);
        List<Type> types = typeSerivce.listType(pageNum);
        if (types!=null){
            PageInfo<Type> pageInfo = new PageInfo<Type>(types);
            return Msg.success(pageInfo).add("success", "获取数据列表成功!!!");
        }else {
            return Msg.fail(CustomizeErrorCode.SERVER_ERROR);
        }
    }
    @GetMapping("/types/delete/{id}")
    @ResponseBody
    public Msg delete(@PathVariable Long id){
        int delete = typeSerivce.delete(id);
        if (delete>0){
            return Msg.success().add("success","删除分类成功");
        }
        return Msg.fail().add("error","系统异常");
    }


    /**
     * 跳转去编辑的页面
     *
     * @param id
     * @return
     */
    @GetMapping("/types/{id}")
    @ResponseBody
    public Msg editPost(@PathVariable(name = "id") Long id, HttpSession session) {
        Type type = typeSerivce.getByIdType(id);
        if (type != null) {
            session.setAttribute("updateId", id);
            return Msg.success().add("success","欢迎来到修改页面");
        } else {
            return Msg.fail(CustomizeErrorCode.SERVER_ERROR);
        }
    }

    //回显更新数据
    @GetMapping("/echoDataType")
    @ResponseBody
    public Msg echoData(HttpSession session) {
        Long updateId = (Long) session.getAttribute("updateId");
        Type type = typeSerivce.getByIdType(updateId);
        if (type != null) {
            return Msg.success(type);
        }
        return Msg.fail(CustomizeErrorCode.SERVER_ERROR);
    }

    /**
     * 更新分类
     * @param ty
     * @param session
     * @return
     */
    @PostMapping("/updateType")
    @ResponseBody
    public Msg updateTag(Type ty,HttpSession session) {
        Long updateId = (Long) session.getAttribute("updateId");
        Type type = typeSerivce.getByIdType(updateId);
        //查询到的名字是否和那个名字相等
        if (type.getName().equals(ty.getName())){
            return Msg.fail().add("error","该分类未修改");
        }else {
            Type t = new Type();
            t.setId(updateId);
            t.setName(ty.getName());
            int update = typeSerivce.update(t);
            if (update>0){
                session.removeAttribute("updateId");
                return Msg.success().add("success","分类修改成功");
            }else {
                return Msg.fail().add("error","系统异常");
            }

        }
    }

}
