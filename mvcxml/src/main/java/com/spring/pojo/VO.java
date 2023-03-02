package com.spring.pojo;

import lombok.Data;

import java.util.List;

/**
 * {@code @Description:}
 */
@Data
public class VO {
    private List<User> userList;
    
    public List<User> getUserList() {
        return userList;
    }
}