package com.spring.aopxml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description:
 */
public class MyAspect {
    /**
     * 前置通知
     */
    public void before() {
        System.out.println("前置增强。。。");
    }
    
    /**
     * 后置通知
     */
    public void afterReturning() {
        System.out.println("后置增强。。。");
    }
    
    /**
     * 环绕通知
     * 1.返回类型必须为Object类型
     * 2.必须接收一个ProceedingJoinPoint类型的参数
     * 3.必须抛出异常
     *
     * @param proceedingJoinPoint 切入点
     * @return
     */
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强。。。");
        Object proceed = proceedingJoinPoint.proceed();// 切入点方法
        System.out.println("环绕后增强。。。");
        return proceed;
    }
    
    /**
     * 异常通知
     */
    public void throwing() {
        System.out.println("异常抛出增强。。。");
    }
    
    /**
     * 最终通知
     */
    public void after() {
        System.out.println("最终增强。。。");
    }
}