import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 */
public class SpringTest {
    
    @Test
    public void scopeTest() {
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 通过容器获取实例
        // UserDao userDao1 = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao1 = applicationContext.getBean("userDao", UserDaoImpl.class);
        
        // UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = applicationContext.getBean("userDao", UserDaoImpl.class);
        
        // 当配置文件中的scope为singleton
        /* 配置文件一加载就调用无参构造器创建Bean实例 */
        System.out.println(userDao1 == userDao2); // true
        
        // 当配置文件中的scope为prototype
        /* 当获取Bean时才调用无参构造器创建Bean实例 */
        // System.out.println(userDao1==userDao2); // false
    }
    
    
    @Test
    public void lifeTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDaoImpl.class);
        System.out.println(userDao);/* 对象先创建才有初始化方法，所以先调用UserDaoImpl */
        // UserDaoImpl调用了
        // Bean初始化后执行初始化方法
        // com.spring.dao.impl.UserDaoImpl@77847718
        
        ((ClassPathXmlApplicationContext) applicationContext).close();
        // Bean销毁前执行销毁方法
    }
    
    
    @Test
    public void staticFactoryTest() {
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取实例
        UserDao userDao = applicationContext.getBean("userDao", UserDaoImpl.class);
        userDao.say(); // hello
    }
    
    @Test
    public void dynamicFactoryTest() {
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.say(); // hello
    }
}
