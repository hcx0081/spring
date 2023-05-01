package com.spring.all;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@code @Description:}
 */
public class m {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        // for (String name : context.getBeanDefinitionNames()) {
        //     System.out.println(name);
        // }
    }
}