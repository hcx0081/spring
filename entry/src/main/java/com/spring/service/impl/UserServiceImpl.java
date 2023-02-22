package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;

/**
 * {@code @Description:}
 */
public class UserServiceImpl implements UserService {
    
    private UserDao userDao;
    
    public UserServiceImpl() {
    }
    
    // 添加有参构造器，用于实现依赖注入
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    
    // 添加UserDao属性的Setter方法，用于实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @Override
    public void say() {
        userDao.say();
    }
}