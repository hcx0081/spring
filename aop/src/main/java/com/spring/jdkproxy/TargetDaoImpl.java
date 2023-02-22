package com.spring.jdkproxy;

/**
 * {@code @Description:}
 */
public class TargetDaoImpl implements TargetDao {
    @Override
    public void save() {
        System.out.println("save()方法");
    }
}