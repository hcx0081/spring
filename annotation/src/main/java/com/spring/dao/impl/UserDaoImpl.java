package com.spring.dao.impl;

import com.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description:
 */
// <bean id="userDao" class="com.spring.dao.impl.UserDaoImpl"></bean>
// @Component("userDao") // 标注上id，相当于在配置文件配置了上面
@Repository("userDao")

@Scope("singleton") // 标注Bean的作用范围
public class UserDaoImpl implements UserDao {
    
    @Value("${jdbc.username}")
    private String username;
    
    
    @Override
    public void say() {
        System.out.println("hello");
        System.out.println(username);
    }
    
    @PostConstruct // 初始化执行的方法
    public void init() {
        System.out.println("执行初始化方法");
    }
    
    @PreDestroy // 销毁前执行的方法
    public void destroy() {
        System.out.println("执行销毁方法");
    }
}
