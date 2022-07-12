package com.spring.controller;

import com.spring.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 */
public class AccountController {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = classPathXmlApplicationContext.getBean(AccountService.class);
        accountService.transfer("zhangsan", "lisi", 100);
        System.out.println("转账成功");
    }
}
