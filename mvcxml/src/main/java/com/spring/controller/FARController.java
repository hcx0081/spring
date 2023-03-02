package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class FARController {
    @RequestMapping("/index")
    public String index() {
        // 转发到请求方法
        // return "forward:/user/login";
        // return "forward:login";
        
        // 转发到WEB-INF/jsp目录下的视图（重定向无法访问WEB-INF目录）
        // return "forward:/WEB-INF/jsp/login.jsp";
        
        // 重定向到请求方法（注意是相对路径）
        // return "redirect:login";
        
        // 直接请求转发到视图
        return "login";
    }
    
    @RequestMapping("/login")
    public String login() {
        System.out.println("login");
        // 直接请求转发到视图
        return "login";
    }
}