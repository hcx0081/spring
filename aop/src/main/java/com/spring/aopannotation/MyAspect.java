package com.spring.aopannotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
@Aspect// 定义切面
public class MyAspect {
    // 定义切入点表达式
    @Pointcut("execution(* com.spring.aopannotation.*.*(..))")
    // 需要使用一个返回值为void，方法体为空的方法定义切入点
    private void myPointCut() {
    }
    
    // 前置通知
    @Before("MyAspect.myPointCut()")// 也可以这样配置切入点表达式
    public void before(JoinPoint joinPoint) {
        System.out.println("前置增强。。。");
    }
    
    // 后置通知
    @AfterReturning("myPointCut()")
    public void afterReturning() {
        System.out.println("后置增强。。。");
    }
    
    // 环绕通知
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强。。。");
        Object proceed = proceedingJoinPoint.proceed();// 执行切入点方法
        System.out.println("环绕后增强。。。");
        return proceed;
    }
    
    // 异常通知
    @AfterThrowing("myPointCut()")
    public void throwing() {
        System.out.println("异常抛出增强。。。");
    }
    
    // 异常通知
    @After("myPointCut()")
    public void after() {
        System.out.println("最终增强。。。");
    }
}