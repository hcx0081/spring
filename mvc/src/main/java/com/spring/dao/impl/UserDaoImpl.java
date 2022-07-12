package com.spring.dao.impl;

import com.spring.dao.UserDao;

/**
 * @description:
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("hello");
    }
}
