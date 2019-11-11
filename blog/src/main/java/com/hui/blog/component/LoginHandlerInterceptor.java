package com.hui.blog.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/9/29
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser==null){
            //没有登陆
            //没有登陆直接请求转发到index.html,在通过自定义视图控制器,转发到登陆页面
            request.getRequestDispatcher("/admin").forward(request,response);
            return false;
        }
        return true;
    }

}
