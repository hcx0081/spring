package com.spring.controller;

import com.spring.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * {@code @Description:}
 */
@Controller
public class HelloController {
    @Resource
    ApplicationContext applicationContext;
    
    @ResponseBody
    @RequestMapping("/hello")
    public User hello() {
        User user = new User();
        user.setUsername("张三");
        user.setAge(20);
        return user;
    }
    
    @RequestMapping("/login")
    public String login() {
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(applicationContext.getBean(name) + "========" + name);
        }
        System.out.println("login");
        return "login";
    }
    
    @ResponseBody
    @RequestMapping("/user")
    public String user(User user) {
        return "user";
    }
}