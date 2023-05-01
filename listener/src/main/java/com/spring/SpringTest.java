package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * {@code @Description:}
 */
@ComponentScan("com")
public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringTest.class);
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        context.start();
    }
}