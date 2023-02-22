package com.spring.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * {@code @Description:} 拦截器
 */
public class MainInterceptor implements HandlerInterceptor {
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if (session.getAttribute("name") != null) {
            System.out.println("执行拦截器----用户存在，放行");
            return true;
        } else {
            System.out.println("执行拦截器----用户不存在，不放行");
            // 重定向至登录界面
            response.sendRedirect("/login.jsp");
            return false;
        }
    }
}