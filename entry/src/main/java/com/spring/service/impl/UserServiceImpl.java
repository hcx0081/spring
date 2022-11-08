package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;

/**
 * @description:
 */
public class UserServiceImpl implements UserService {
    
    private UserDao userDao;
    
    // 添加UserDao属性的Setter方法，用于实现依赖
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    public UserServiceImpl() {
    }
    
    // 添加构造器，用于实现依赖
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    
    @Override
    public void say() {
        userDao.say();
    }
}
