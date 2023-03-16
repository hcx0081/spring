package com.spring.xml;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * {@code @Description:}
 */
public class m {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        // App app = context.getBean("app", App.class);
        // System.out.println(app);
        
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            
            System.out.println(beanDefinitionName);
            
            BeanDefinition beanDefinition = context.getBeanFactory().getBeanDefinition(beanDefinitionName);
            System.out.println(beanDefinition.getBeanClassName());
        }
    }
}