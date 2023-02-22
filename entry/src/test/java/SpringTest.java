import com.spring.dao.UserDao;
import com.spring.dao.impl.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * {@code @Description:}
 */
public class SpringTest {
    @Test
    public void scopeTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 通过容器获取实例
        // UserDao userDao1 = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao1 = applicationContext.getBean("userDao", UserDaoImpl.class);
        
        // UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = applicationContext.getBean("userDao", UserDaoImpl.class);
        
        // 当配置文件中的scope为singleton
        System.out.println(userDao1 == userDao2);// true
        
        // 当配置文件中的scope为prototype
        // System.out.println(userDao1 == userDao2);// false
    }
    
    
    @Test
    public void lifeTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDaoImpl.class);
        System.out.println(userDao);/* 实例化Bean才有初始化方法，所以先调用无参构造器 */
        // UserDaoImpl()调用了
        // 执行初始化方法
        // com.spring.dao.impl.UserDaoImpl@77847718
        ((ClassPathXmlApplicationContext) applicationContext).close();
        // 执行销毁方法
    }
    
    
    @Test
    public void staticFactoryTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取实例
        UserDao userDao = applicationContext.getBean("userDao", UserDaoImpl.class);
        userDao.say();// hello
    }
    
    @Test
    public void dynamicFactoryTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.say();// hello
    }
}