package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class FARController {
    
    @RequestMapping("/index")
    public String index() {
        // 转发到一个请求方法（同一个控制器类可以省略 /user/ 因为这样是相对路径）
        // return "forward:/user/login";
        // return "forward:login";/*如果控制器类中没有该方法也不能用这种操作直接跳转到视图，若要访问则 return "forward:/login.jsp";*/
        //
        // 转发到WEB-INF目录下的jsp目录下的视图（重定向无法访问WEB-INF目录）
        // return "forward:/WEB-INF/jsp/login.jsp";
        //
        // 重定向到一个请求方法（同一个控制器类可以省略 /user/ 因为这样是相对路径）
        // return "redirect:/user/login";
        return "redirect:login";/* 如果控制器类中没有该方法也不能用这种操作直接跳转到视图，若要访问则 return "redirect:/login.jsp"; */
        
        // 直接转发到视图
        // return "login";
    }
    
    
    @RequestMapping("/login")
    public String login() {
        // 转发到一个视图
        return "login";
    }
}
