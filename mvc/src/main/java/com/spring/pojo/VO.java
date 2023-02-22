package com.spring.pojo;

import java.util.List;

/**
 * {@code @Description:}
 */
public class VO {
    private List<User> userList;
    
    public List<User> getUserList() {
        return userList;
    }
    
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    
    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}