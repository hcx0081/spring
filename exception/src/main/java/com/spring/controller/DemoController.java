package com.spring.controller;

import com.spring.exception.CustomException;
import com.spring.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;

/**
 * {@code @Description:}
 */
@Controller
public class DemoController {
    
    @Autowired
    private DemoService demoService;
    
    @RequestMapping("/show")
    public String show() throws CustomException, FileNotFoundException {
        // demoService.show1();// 抛出类型转换异常
        // demoService.show2();// 抛出除0异常
        // demoService.show3();// 抛出文件查找不到异常
        // demoService.show4();// 抛出空指针异常
        // demoService.show5();// 抛出自定义异常
        return "index";
    }
    
    
    @RequestMapping("/showEH")
    public String showEH() {
        demoService.show1();// 抛出类型转换异常
        return "index";
    }
    
    // 当发生类型转换异常时处理
    @ExceptionHandler(ClassCastException.class)
    public String CustomException(Exception e) {
        System.out.println("打印错误信息:" + e);// 打印错误信息:java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        // 跳转到指定页面
        return "errorCC";
    }
    
}