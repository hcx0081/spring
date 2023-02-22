package com.spring.ano;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * {@code @Description:}
 */
@Component
public class App {
    @Resource
    Person person;
    
    public App() {
        System.out.println("app");
    }
    
    public void setPerson(Person person) {
        this.person = person;
        System.out.println("setter");
    }
}