package com.spring;

import com.spring.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@code @Description:}
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        for (String name : context.getBeanDefinitionNames()) {
            
            System.out.println(name);
        }
    }
}