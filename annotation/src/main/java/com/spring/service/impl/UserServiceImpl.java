package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * {@code @Description:}
 */
// <bean id="userService" class="com.spring.service.impl.UserServiceImpl"></bean>
// @Component("userService")
@Service("userService")

public class UserServiceImpl implements UserService {
    
    // <property name="userDao" ref="userDao"></property>
    // @Autowired
    // @Qualifier("userDao")
    
    @Resource(name = "userDao")// 相当于@Autowired+@Qualifier
    private UserDao userDao;
    
    /* 通过注解注册可以省略编写Setter方法 */
    /* public void setUserDao(UserDao userDao) {
       this.userDao = userDao;
    } */
    
    @Override
    public void say() {
        userDao.say();
    }
}