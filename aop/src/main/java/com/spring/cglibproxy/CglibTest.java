package com.spring.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * {@code @Description:}
 */
public class CglibTest {
    public static void main(String[] args) {
        // 目标对象
        Target target = new Target();
        // 增强对象
        Advice advice = new Advice();
        // 返回值为动态生成的代理对象，基于cglib
        // 1.创建增强器
        Enhancer enhancer = new Enhancer();
        
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        
        // 3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                // 前置增强
                advice.before();
                
                // 调用目标对象的方法
                Object invoke = method.invoke(target, args);
                
                // 后置增强
                advice.afterReturning();
                return invoke;
            }
        });
        
        // 4.创建代理对象
        Target proxy = (Target) enhancer.create();
        
        // 调用代理对象的方法
        proxy.save();
    }
}