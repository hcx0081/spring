package com.spring.listener;
/**
 * {@code @Description:} 监听器
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionListener;

public class ContextLoaderListenerByCustom implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        
        /* 手动获取Spring应用上下文对象 */
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");// 相当于下面
        
        /* 获取ServletContext全局配置对应参数名的值，从值中获取Spring应用上下文对象 */
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfigLocation);
        
        /* 将Spring容器对象存储到ServletContext域中 */
        servletContext.setAttribute("applicationContext", applicationContext);
        
        System.out.println("Spring容器创建完毕");
    }
}