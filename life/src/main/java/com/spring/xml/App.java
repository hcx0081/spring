package com.spring.xml;

/**
 * {@code @Description:}
 */
public class App {
    Person person;
    
    public App() {
        System.out.println("app");
    }
    
    public void setPerson(Person person) {
        this.person = person;
        System.out.println("setter");
    }
}