package com.spring.ioc;

import com.spring.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * {@code @Description:}
 */
public class iocTest {
    public static void main(String[] args) {
        // 加载配置文件初始化Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 通过容器获取实例
        // UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        // UserDao bean = applicationContext.getBean("userDao", UserDaoImpl.class);
        //
        // userDao.say();//　hello
        // bean.say();//　hello
        
        
        UserServiceImpl userService = applicationContext.getBean("userService", UserServiceImpl.class);
        userService.say();
    }
}