package com.hui.blog.service.impl;

import com.hui.blog.bean.User;
import com.hui.blog.bean.UserExample;
import com.hui.blog.mapper.AdminMapper;
import com.hui.blog.mapper.UserMapper;
import com.hui.blog.service.AdminService;
import com.hui.blog.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/11
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public User doLogin(String username, String password) {
        return adminMapper.login(username,password);
    }
}
