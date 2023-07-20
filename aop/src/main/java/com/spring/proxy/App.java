package com.spring.proxy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * {@code @Description:}
 */
@ComponentScan("com.spring.proxy")
@EnableAspectJAutoProxy(exposeProxy = true)// 开启暴露代理对象
@Configuration
public class App {
}
