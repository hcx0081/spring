package com.spring.controller;

import com.spring.config.SpringConfiguration;
import com.spring.service.UserService;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 控制层
 */
public class UserController {
    public static void main(String[] args) {
        
        // Spring容器加载该注解配置类，实现全注解开发
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        
        UserService userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.say();
        ((AnnotationConfigApplicationContext) applicationContext).close();
        // 执行初始化方法
        // hello
        // root
        // 执行销毁方法
    }
}
