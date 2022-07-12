package com.spring.service.impl;

import com.spring.exception.CustomException;
import com.spring.service.DemoService;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @description:
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    
    @Override
    public void show1() {
        System.out.println("抛出类型转换异常");
        Object str = "zs";
        Integer num = (Integer) str;
    }
    
    @Override
    public void show2() {
        System.out.println("抛出除0异常");
        int i = 1 / 0;
    }
    
    @Override
    public void show3() throws FileNotFoundException {
        System.out.println("抛出文件查找不到异常");
        FileInputStream inputStream = new FileInputStream("D:/xxx/xxx.txt");
    }
    
    @Override
    public void show4() {
        System.out.println("抛出空指针异常");
        String str = null;
        str.length();
    }
    
    @Override
    public void show5() throws CustomException {
        System.out.println("抛出自定义异常");
        throw new CustomException();
    }
    
}
