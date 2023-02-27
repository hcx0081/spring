package com.spring.ano;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * {@code @Description:}
 */
@Component
public class App implements BeanPostProcessor {
    // @Resource
    Person person;
    
    
    @Resource(name = "stu")
    Per per;
    
    public App(Person person) {
        this.person = person;
        System.out.println("app");
        System.out.println(this.person);
    }
    
    // public void setPerson(Person person) {
    //     this.person = person;
    //     System.out.println("setter");
    // }
    
    @PostConstruct
    public void init() {
        System.out.println("App初始化");
    }
    
    // @Override
    // public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println(1);
    //     return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    // }
    
    // @Override
    // public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println(2);
    //     return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    // }
}