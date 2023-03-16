package com.spring.all;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor：Bean实例化之前");
        return null;
    }
    
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor：Bean实例化之后，属性赋值之前");
        return true;
    }
    
    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("MyInstantiationAwareBeanPostProcessor：属性赋值");
        pvs.forEach(System.out::println);
        return null;
    }
}