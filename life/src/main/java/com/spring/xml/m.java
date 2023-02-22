package com.spring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * {@code @Description:}
 */
public class m {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        App app = context.getBean("app", App.class);
        System.out.println(app);
    }
}