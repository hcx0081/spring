package com.spring;

import com.spring.config.SpringConfig;
import com.spring.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.BindException;
import org.springframework.validation.Validator;

import javax.annotation.Resource;

/**
 * {@code @Description:}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringTest {
    
    @Resource
    Validator validator;
    
    @Test
    public void test() {
        Person person = new Person();
        BindException exception = new BindException(person, "p");
        validator.validate(person, exception);
        System.out.println(exception.getMessage());
    }
}