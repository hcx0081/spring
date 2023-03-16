package com.spring;

import com.spring.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@code @Description:}
 */
public class m {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
            
            System.out.println("--" + context.getBean(beanDefinitionName));
        }
        
        // System.out.println(context.getBean("myService", MyService.class));
    }
}