package com.spring.xml;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * {@code @Description:}
 */
public class Person implements BeanPostProcessor {
    public Person() {
        System.out.println("person");
    }
    
    // @Override
    // public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println("p1");
    //     return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    // }
    //
    // @Override
    // public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println("p2");
    //     return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    // }
}