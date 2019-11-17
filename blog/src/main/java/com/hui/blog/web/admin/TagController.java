package com.hui.blog.web.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hui.blog.bean.Tag;
import com.hui.blog.commons.Msg;
import com.hui.blog.exception.CustomizeErrorCode;
import com.hui.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/12
 */
@CrossOrigin("*")
@Controller
@RequestMapping("/admin")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/saveTag")
    @ResponseBody
    public Msg saveTag(Tag tag) {
        Tag getTag = tagService.getTag(tag.getName());
        System.out.println(getTag);
        if (getTag == null) {
            int i = tagService.saveTag(tag);
            if (i > 0) {
                return Msg.success().add("success", "添加标签成功!!!");
            } else {
                return Msg.fail().add("error", "添加分类失败!!!");
            }
        } else {
            return Msg.fail().add("error", "该标签已经存在,不能重复添加!");
        }
    }

    @GetMapping("/tagList")
    @ResponseBody
    public Msg listTag(@RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<Tag> tags = tagService.listTag(pageNum);
        if (tags != null) {
            PageInfo<Tag> pageInfo = new PageInfo<Tag>(tags);
            //显示分页条数量 5
            //pageInfo.setNavigatePages(5);
            //PageInfo pageInfo = new PageInfo(tags,5);
            return Msg.success(pageInfo).add("success", "获取数据列表成功!!!");
        } else {
            return Msg.fail(CustomizeErrorCode.SERVER_ERROR);
        }
    }

    /**
     * 跳转去编辑的页面
     *
     * @param id
     * @return
     */
    @GetMapping("/tags/{id}")
    @ResponseBody
    public Msg editPost(@PathVariable(name = "id") Long id, HttpSession session) {
        Tag byIdTag = tagService.getByIdTag(id);
        if (byIdTag != null) {
            session.setAttribute("updateId", id);
            return Msg.success().add("success","欢迎来到修改页面");
        } else {
            return Msg.fail(CustomizeErrorCode.SERVER_ERROR);
        }
    }

    //回显更新数据
    @GetMapping("/echoDataTag")
    @ResponseBody
    public Msg echoData(HttpSession session) {
        Long updateId = (Long) session.getAttribute("updateId");
        Tag byIdTag = tagService.getByIdTag(updateId);
        if (byIdTag != null) {
            return Msg.success(byIdTag);
        }
        return Msg.fail(CustomizeErrorCode.SERVER_ERROR);
    }

    /**
     * 更新标签
     * @param tag
     * @param session
     * @return
     */
    @PostMapping("/updateTag")
    @ResponseBody
    public Msg updateTag(Tag tag,HttpSession session) {
        Long updateId = (Long) session.getAttribute("updateId");
        //System.out.println(tag.getName()+":"+updateId);
        Tag byIdTag = tagService.getByIdTag(updateId);
        //查询到的名字是否和那个名字相等
        if (byIdTag.getName().equals(tag.getName())){
            return Msg.fail().add("error","该标签未修改");
        }else {
            Tag t = new Tag();
            t.setId(updateId);
            t.setName(tag.getName());
            int update = tagService.update(t);
            if (update>0){
                session.removeAttribute("updateId");
                return Msg.success().add("success","标签修改成功");
            }else {
                return Msg.fail().add("error","系统异常");
            }
        }
    }

    @GetMapping("/tags/delete/{id}")
    @ResponseBody
    public Msg delete(@PathVariable Long id){
        int delete = tagService.delete(id);
        if (delete>0){
            return Msg.success().add("success","删除标签成功");
        }
        return Msg.fail().add("error","系统异常");
    }

}
