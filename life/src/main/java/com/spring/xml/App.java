package com.spring.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * {@code @Description:}
 */
public class App implements BeanPostProcessor {
    Person person;
    
    public App() {
        System.out.println("app");
    }
    
    public void setPerson(Person person) {
        this.person = person;
        System.out.println("setter");
    }
    
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(1);
        return bean;
    }
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(2);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
    
    public void init() {
        System.out.println("App初始化");
    }
}