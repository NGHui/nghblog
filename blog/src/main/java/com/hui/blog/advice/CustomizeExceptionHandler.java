package com.hui.blog.advice;

import com.hui.blog.commons.Msg;
import com.hui.blog.exception.CustomizeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/20
 */
@ControllerAdvice
public class CustomizeExceptionHandler {

    //异常统一返回json格式
    @ExceptionHandler(value = CustomizeException.class)
    @ResponseBody
    public Msg jsonErrorHandler(HttpServletRequest req, CustomizeException e) {
        Msg msg = new Msg();
        msg.setMsg(e.getMessage());
        msg.setCode(e.getCode());
        msg.setData(null);
        return msg;
    }



}
