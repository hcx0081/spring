import com.spring.config.SpringConfiguration;
import com.spring.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: Spring集成Junit测试
 */

@RunWith(SpringJUnit4ClassRunner.class)

//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration(classes = {SpringConfiguration.class})//指定配置文件或配置类
public class SpringJunitTest {
    
    @Autowired
    private UserService userService;
    
    @Test
    public void junitTest() {
        userService.say();
        //执行初始化方法
        //hello
        //root
        //执行销毁方法
    }
    
}
