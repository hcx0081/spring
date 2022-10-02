package com.spring.factory;

import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;

/**
 * @description: 实例工厂
 */
public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
