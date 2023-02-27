package com.spring.ano;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@code @Description:}
 */
public class m {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        // Stu stu = context.getBean("stu", Stu.class);
        // stu.say();
        // for (String beanDefinitionName : context.getBeanDefinitionNames()) {
        //
        //     System.out.println(beanDefinitionName);
        //
        //     BeanDefinition beanDefinition = context.getBeanDefinition(beanDefinitionName);
        //     System.out.println(beanDefinition.getBeanClassName());
        // }
        Config bean = context.getBean(Config.class);
        System.out.println(bean);
        
        context.getEnvironment();
    }
}