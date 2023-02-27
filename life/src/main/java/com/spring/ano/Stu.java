package com.spring.ano;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * {@code @Description:}
 */
@Component
@PropertySource("classpath:jdbc.properties")
public class Stu implements Per {
    @Value("${jdbc.name}")
    String name;
    
    public Stu() {
        System.out.println("sssss");
    }
    
    @PostConstruct
    public void say() {
        System.out.println(name);
        System.out.println("stu初始化");
    }
    
    
}