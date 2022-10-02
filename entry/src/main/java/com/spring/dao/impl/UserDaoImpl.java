package com.spring.dao.impl;

import com.spring.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @description:
 */
public class UserDaoImpl implements UserDao {
    
    // private String username;
    // private String password;
    
    private List userList;
    private Map userMap;
    private Properties userProperties;
    
    
    public UserDaoImpl() {
        System.out.println("UserDaoImpl调用了");
    }
    
    // public void setUsername(String username) {
    //    this.username = username;
    // }
    //
    // public void setPassword(String password) {
    //    this.password = password;
    // }
    
    public void setUserList(List userList) {
        this.userList = userList;
    }
    
    public void setUserMap(Map userMap) {
        this.userMap = userMap;
    }
    
    public void setUserProperties(Properties userProperties) {
        this.userProperties = userProperties;
    }
    
    /**
     * 定义初始化方法
     */
    public void init() {
        System.out.println("执行初始化方法");
    }
    
    /**
     * 定义销毁方法
     */
    public void destroy() {
        System.out.println("执行销毁方法");
    }
    
    @Override
    public void say() {
        System.out.println("hello");
        
        // System.out.println(username);
        // System.out.println(password);
        
        System.out.println(userList);
        System.out.println(userMap);
        System.out.println(userProperties);
    }
}
