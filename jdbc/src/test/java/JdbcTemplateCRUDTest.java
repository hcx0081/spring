import com.spring.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description:
 */

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:applicationContext.xml")// 加载指定配置文件或配置类
public class JdbcTemplateCRUDTest {
    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Test
    public void testUpdate() {
        jdbcTemplate.update("update account set money =? where name =?", 100000, "zs");
    }
    
    @Test
    public void testDelete() {
        jdbcTemplate.update("delete from account where name =?", "wu");
    }
    
    @Test
    public void testQueryAll() {
        List<Account> accountList = jdbcTemplate.query("select * from  account", new BeanPropertyRowMapper<>(Account.class));
        accountList.forEach(System.out::println);
    }
    
    @Test
    public void testQueryOne() {
        Account account = jdbcTemplate.queryForObject("select * from  account where name=?", new BeanPropertyRowMapper<>(Account.class), "zs");
        System.out.println(account);// Account{name='zs', money='100000'}
    }
    
    @Test
    public void testQueryCount() {
        Long query = jdbcTemplate.queryForObject("select count(*) from  account where name=?", Long.class, "zs");
        System.out.println(query);// 1
    }
}