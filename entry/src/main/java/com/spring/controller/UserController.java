package com.spring.controller;

import com.spring.service.UserService;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 控制层
 */
public class UserController {
    public static void main(String[] args) {
        //初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取实例
        UserService userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.say();
    }
}
