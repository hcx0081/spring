package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;

/**
 * {@code @Description:}
 */

public class UserServiceImpl implements UserService {
    
    private UserDao userDao;
    
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public void say() {
        userDao.say();
    }
}