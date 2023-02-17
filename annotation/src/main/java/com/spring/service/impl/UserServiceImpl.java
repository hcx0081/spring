package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 */
// <bean id="userService" class="com.spring.service.impl.UserServiceImpl"></bean>
// @Component("userService")// 标注上id，相当于在配置文件配置了上面
@Service("userService")

public class UserServiceImpl implements UserService {
    
    // <property name="userDao" ref="userDao"></property>
    // @Autowired // 按照实例类型从Spring容器中进行匹配，不精准，因为容器中实例类型相同的可能有多个。可以单独使用。
    // @Qualifier("userDao")// 标注上name，实例名称。相当于在配置文件中的Bean里面配置了上面实现依赖注入。必须与@Autowired结合使用
    
    @Resource(name = "userDao")// 相当于@Autowired+@Qualifier
    private UserDao userDao;
    
    /* 如果通过注解装配可以省略不用编写Setter方法，注解会通过反射将属性注入到实例中 */
    /* public void setUserDao(UserDao userDao) {
       this.userDao = userDao;
    } */
    
    @Override
    public void say() {
        userDao.say();
    }
}