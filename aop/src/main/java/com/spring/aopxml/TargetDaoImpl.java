package com.spring.aopxml;

import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
public class TargetDaoImpl implements TargetDao {
    @Override
    public void save() {
        int i = 1 / 0;
        System.out.println("save()方法");
    }
}