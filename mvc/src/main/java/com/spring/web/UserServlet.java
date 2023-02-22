package com.spring.web;
/**
 * {@code @Description:} ${description}
 */

import com.spring.service.UserService;
import com.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // ServletContext servletContext = request.getServletContext();
        ServletContext servletContext = this.getServletContext(); // 相当于上面
        
        /* 手动从域中获取配置文件 */
        // ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");
        /* 通过自定义工具类从域中获取配置文件 */
        // ApplicationContext applicationContext = WebApplicationContextUtilsByCustom.getApplicationContext(servletContext);
        /* 通过Spring封装的工具类从域中获取配置文件 */
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        
        UserService userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.say();
    }
}