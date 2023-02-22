package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * {@code @Description:}控制层
 */

@Controller
@RequestMapping("/user")
public class UserController {
    // http://localhost:8080/user/say
    @RequestMapping(value = "/say")
    public String say() {
        return "success";
    }
}