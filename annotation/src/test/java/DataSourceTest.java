import com.alibaba.druid.pool.DruidDataSource;
import com.spring.config.SpringConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description:
 */
public class DataSourceTest {
    
    @Test
    public void springDataSourceTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(connection);
    }
    
    @Test
    public void springDataSourceAnoTest(){
        //Spring容器加载该注解配置类，实现全注解开发
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        DruidDataSource dataSource = applicationContext.getBean("dataSource", DruidDataSource.class);
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(connection);
    }
    
}
