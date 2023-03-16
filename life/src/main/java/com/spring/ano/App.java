package com.spring.ano;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
public class App implements BeanPostProcessor {
    // public App() {
    //     System.out.println("app");
    // }
    
    // @PostConstruct
    // public void init() {
    //     System.out.println("App初始化");
    // }
    
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