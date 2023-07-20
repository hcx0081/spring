package com.spring.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
@Aspect// 定义切面
public class MyAspect {
    // 环绕通知
    @Around("execution(public void com.spring.proxy.Target.method1()) || execution(public void  com.spring.proxy.Target.method2())")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(proceedingJoinPoint.getSignature().getName() + "环绕前增强。。。");
        Object proceed = proceedingJoinPoint.proceed();// 执行切入点方法
        System.out.println(proceedingJoinPoint.getSignature().getName() + "环绕后增强。。。");
        return proceed;
    }
}