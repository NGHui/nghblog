package com.hui.blog.service;

import com.hui.blog.bean.User;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/11
 */
public interface AdminService {

    //管理员登陆功能
    User doLogin(String username,String password);
}
