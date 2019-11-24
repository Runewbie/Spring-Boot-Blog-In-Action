package com.springboot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: li_jian
 * @version: 1.0
 * @date: 2019/11/2 09:46
 * @description：
 */
@RestController // @RestController = @Controller + @ResponseBody，返回一个符合restful风格的 json串
public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello World!";
    }
}
