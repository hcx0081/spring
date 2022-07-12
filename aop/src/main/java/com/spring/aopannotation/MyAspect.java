package com.spring.aopannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Description:
 */
@Component
@Aspect//定义切面
public class MyAspect {
    
    //定义切面表达式
    @Pointcut("execution(* com.spring.aopannotation.*.*(..))")
    //需要使用一个返回值为void，方法体为空的方法来命名切入点
    private void myPointCut() {
    }
    
    /**
     * 前置通知
     */
    @Before("MyAspect.myPointCut()")
    public void before() {
        System.out.println("前置增强。。。");
    }
    
    /**
     * 后置通知
     */
    @AfterReturning("myPointCut()")
    public void afterReturning() {
        System.out.println("后置增强。。。");
    }
    
    /**
     * 环绕通知
     * 1.返回类型必须为Object类型
     * 2.必须接受一个ProceedingJoinPoint类型的参数
     * 3.必须抛出异常
     *
     * @param proceedingJoinPoint 切入点
     * @return
     */
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前增强。。。");
        Object proceed = proceedingJoinPoint.proceed();//切点方法
        System.out.println("环绕后增强。。。");
        return proceed;
    }
    
    /**
     * 异常通知
     */
    @AfterThrowing("myPointCut()")
    public void throwing() {
        System.out.println("异常抛出增强。。。");
    }
    
    /**
     * 最终通知
     */
    @After("myPointCut()")
    public void after() {
        System.out.println("最终增强。。。");
    }
}
