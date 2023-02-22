package com.spring.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

/**
 * {@code @Description:} 从ServletContext域中取出配置文件的工具类
 */
public class WebApplicationContextUtilsByCustom {
    /**
     * 将获取applicationContext配置文件的方法进行封装，这样以后获取配置文件的时候就不需要知道文件的名字，
     * 只需要获取servletContext应用上下文即可获取配置文件
     *
     * @param servletContext
     * @return
     */
    public static ApplicationContext getApplicationContext(ServletContext servletContext) {
        return (ApplicationContext) servletContext.getAttribute("applicationContext");
    }
}