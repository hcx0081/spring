package com.spring.proxy;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
public class Target {
    public void method1() {
        // method2();// AOP失效
        ((Target) AopContext.currentProxy()).method2();
        System.out.println("执行method1");
    }

    public void method2() {
        System.out.println("执行method2");
    }
}
