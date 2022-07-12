package com.spring.aopannotation;

import org.springframework.stereotype.Component;

/**
 * @Description:
 */
@Component
public class TargetDaoImpl implements TargetDao {
    @Override
    public void save() {
        //int i = 1 / 0;
        System.out.println("save()方法");
    }
}
