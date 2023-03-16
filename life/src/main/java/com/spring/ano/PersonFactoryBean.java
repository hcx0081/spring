package com.spring.ano;

import org.springframework.beans.factory.FactoryBean;

/**
 * {@code @Description:}
 */
// @Component
public class PersonFactoryBean implements FactoryBean<Person> {
    
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }
    
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
    
}