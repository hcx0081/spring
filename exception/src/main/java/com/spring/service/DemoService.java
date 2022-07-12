package com.spring.service;

import com.spring.exception.CustomException;

import java.io.FileNotFoundException;

/**
 * @description:
 */
public interface DemoService {
    
    public void show1();
    
    public void show2();
    
    public void show3() throws FileNotFoundException;
    
    public void show4();
    
    public void show5() throws CustomException;
}
