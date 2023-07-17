package com.spring.registrar;

import com.spring.entity.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * {@code @Description:}
 */
public class MyFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
