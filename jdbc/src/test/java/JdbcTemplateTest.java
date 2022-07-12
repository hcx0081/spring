import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * @description:
 */
public class JdbcTemplateTest {
    
    @Test
    public void testJT(){
    
        //创建Druid数据库连接池
        DruidDataSource druidDataSource = new DruidDataSource();
    
        //设置数据库需要的配置信息
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc?");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("623363564");
    
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        
        //设置数据源对象
        jdbcTemplate.setDataSource(druidDataSource);
    
        /*无需连接数据池*/
        
        int i = jdbcTemplate.update("insert into account values (?,?)", "wu", 500);
        System.out.println(i);
    }
    
    
    /**
     * 测试通过Spring容器获取装配好的JdbcTemplate
     */
    @Test
    public void testJTDI() throws SQLException {
    
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    
        //获取JdbcTemplate实例
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
    
        /*无需连接数据池*/
        
        int i = jdbcTemplate.update("insert into account values (?,?)", "zl", 500);
        System.out.println(i);
    }
}
