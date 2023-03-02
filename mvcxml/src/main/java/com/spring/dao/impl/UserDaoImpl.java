package com.spring.dao.impl;

import com.spring.dao.UserDao;

/**
 * {@code @Description:}
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("hello");
    }
}