package com.spring.resolver;

import com.spring.exception.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 自定义异常解析器
 */
public class CustomExceptionResolver implements HandlerExceptionResolver {
    
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        /*根据不同的异常转向不同页面（统一处理）*/
        //如果出现自定义异常
        if (ex instanceof CustomException) {
            modelAndView.addObject("info","自定义异常");
            modelAndView.setViewName("errorCustom");
            return modelAndView;
        }
        //如果是其他异常
        modelAndView.addObject("info","无异常或其他异常");
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
