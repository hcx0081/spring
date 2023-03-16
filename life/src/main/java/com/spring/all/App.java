package com.spring.all;

import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
public class App {
    // @Resource
    // Person person;
    //
    // public App(Person person) {
    //     this.person = person;
    //     System.out.println(person);
    //     System.out.println("app初始化");
    // }
    
    public App() {
        System.out.println("app实例化");
    }
}