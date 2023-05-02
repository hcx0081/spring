package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletRequest;

/**
 * {@code @Description:} 控制层
 */
@Controller
@RequestMapping("user")
public class UserController {
    
    @Autowired
    ApplicationContext applicationContext;
    
    // http://localhost:8080/user/say
    @RequestMapping(value = "/say")
    public String say(ServletRequest request) {
        WebApplicationContext context = WebApplicationContextUtils.findWebApplicationContext(request.getServletContext());
        for (String name : context.getBeanDefinitionNames()) {
            
            System.out.println(name);
        }
        return "success";
    }
}