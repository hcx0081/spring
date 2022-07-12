package com.spring.ioc;

import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 */
public class iocTest {

    public static void main(String[] args) {
        //初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过容器获取实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        UserDao bean = applicationContext.getBean("userDao", UserDaoImpl.class);

        userDao.say();//hello
        bean.say();//hello
    }

}
