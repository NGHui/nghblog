package com.hui.blog.web.admin;

import com.hui.blog.bean.User;
import com.hui.blog.commons.Msg;
import com.hui.blog.service.AdminService;
import com.hui.blog.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/11
 */
@CrossOrigin("*")
@Controller
public class LoginController {

    @Autowired
    private AdminService adminServiceImpl;

    @PostMapping("/admin/tologin")
    @ResponseBody
    public Msg doLogin(@RequestParam("username") String username,
                       @RequestParam("password")String password,
                       HttpSession session){
        User user = adminServiceImpl.doLogin(username, MD5Utils.code(password));
        if (user!=null){
            session.setAttribute("loginUser",user);
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }







}
