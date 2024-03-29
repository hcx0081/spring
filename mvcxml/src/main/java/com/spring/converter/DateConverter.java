package com.spring.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * {@code @Description:} 日期类型转换器
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        // 将日期字符串转换为日期对象
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}