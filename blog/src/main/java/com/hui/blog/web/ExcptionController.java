package com.hui.blog.web;

import com.hui.blog.commons.Msg;
import com.hui.blog.exception.CustomizeErrorCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/13
 */
@RestController
public class ExcptionController {

    @RequestMapping("/fail")
    public Msg error(){
        return Msg.fail(CustomizeErrorCode.SERVER_ERROR);
    }

}
