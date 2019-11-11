package com.hui.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/11/11
 */
@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/archives")
    public String archives(){
        return "archives";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/tags")
    public String tags(){
        return "tags";
    }

    @GetMapping("/types")
    public String types(){
        return "types";
    }

    @GetMapping("/admin/blogs")
    public String blogs(){
        return "admin/blogs";
    }

    @GetMapping("/admin/blogs-input")
    public String input(){
        return "admin/blogs-input";
    }

}
