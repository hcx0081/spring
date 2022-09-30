package com.spring.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 */
public class JdkTest {
    public static void main(String[] args) {
        // 目标对象
        TargetDao targetDao = new TargetDaoImpl();
        // 增强对象
        Advice advice = new Advice();
        // 返回值为动态生成的代理对象
        TargetDao proxy = (TargetDao) Proxy.newProxyInstance(targetDao.getClass().getClassLoader(),
                targetDao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 前置增强
                        advice.before();
                        
                        // 调用代理对象的任何方法实质执行的都是invoke方法
                        Object invoke = method.invoke(targetDao, args);
                        
                        // 后置增强
                        advice.afterReturning();
                        return invoke;
                    }
                });
        
        // 调用代理对象的方法
        proxy.save();
        // 前置增强。。。
        // save()方法
        // 后置增强。。。
    }
}
