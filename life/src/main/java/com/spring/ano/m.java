package com.spring.ano;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@code @Description:}
 */
public class m {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
            
            BeanDefinition beanDefinition = context.getBeanDefinition(beanDefinitionName);
            System.out.println("---" + beanDefinition.getBeanClassName());
        }
        // Config bean = context.getBean(Config.class);
        // System.out.println(bean);
        
        // System.out.println(context.getBean("p2"));
        
        // System.out.println(context.getBean(Person.class));
    }
}