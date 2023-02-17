package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Description:
 */
@Controller
public class DateController {
    /*
     * http://localhost:8080/sayDate?date=2000/01/01   Sat Jan 01 00:00:00 CST 2000
     * http://localhost:8080/sayDate?date=2000-01-01   400
     *
     * 配置日期转换器后
     * http://localhost:8080/sayDate?date=2000-01-01   Sat Jan 01 00:00:00 CST 2000
     *
     * 使用自定义转换器转换获取的日期字符串的格式
     * */
    @RequestMapping("/sayDate")
    @ResponseBody
    public void sayDate(Date date) {
        System.out.println(date);
    }
}