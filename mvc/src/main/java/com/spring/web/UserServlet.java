package com.spring.web;
/**
 * @description: ${description}
 */

import com.spring.listener.WebApplicationContextUtilsByCustom;
import com.spring.service.UserService;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContext servletContext = request.getServletContext();
        ServletContext servletContext = this.getServletContext();//相当于上面
    
        /*手动从域中获取配置文件*/
        //ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");
        /*通过自定义工具类从域中获取配置文件*/
        //ApplicationContext applicationContext = WebApplicationContextUtilsByCustom.getApplicationContext(servletContext);
        /*通过Spring封装的工具类从域中获取配置文件*/
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
    
        UserService userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.say();
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    }
}
