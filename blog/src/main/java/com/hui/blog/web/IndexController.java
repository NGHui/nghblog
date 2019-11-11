package com.hui.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/11
 */
@Controller
public class IndexController {

    //@GetMapping("/")
    public String index(){
        return "index";
    }
}
