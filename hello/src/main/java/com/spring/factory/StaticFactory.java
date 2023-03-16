package com.spring.factory;

import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;

/**
 * {@code @Description:} 静态工厂
 */
public class StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}