package com.spring.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * {@code @Description:} 从ServletContext域中获取Spring配置文件的工具类
 */
public class WebApplicationContextUtilsByCustom {
    /**
     * 封装获取Spring配置文件的方法，以后获取配置文件的时候就不需要知道文件的名字，
     * 只需要获取servletContext应用上下文即可获取Spring配置文件
     *
     * @param servletContext
     * @return
     */
    public static ApplicationContext getApplicationContext(ServletContext servletContext) {
        return (ApplicationContext) servletContext.getAttribute("applicationContext");
    }
}