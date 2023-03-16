package com.spring.registrar;

import com.spring.service.impl.MyServiceImpl2;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * {@code @Description:}
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();
        // registry.registerBeanDefinition("person", beanDefinition);
        
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(MyServiceImpl2.class).getBeanDefinition();
        registry.registerBeanDefinition("myService", beanDefinition);
    }
}