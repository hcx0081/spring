package com.spring.cglibproxy;

/**
 * {@code @Description:}
 */
public class Advice {
    public void before() {
        System.out.println("前置增强。。。");
    }
    
    public void afterReturning() {
        System.out.println("后置增强。。。");
    }
}