package com.spring.aopxml;

/**
 * @Description:
 */
public class TargetDaoImpl implements TargetDao {
    @Override
    public void save() {
        int i = 1 / 0;
        System.out.println("save()方法");
    }
}
