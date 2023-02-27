import com.spring.aopannotation.TargetDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * {@code @Description:}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
    // @Resource
    // private TargetDao target;// 一定要使用接口注入
    @Resource
    private TargetDao targetDao;// 一定要使用接口注入
    
    @Test
    public void aopxmlTest() {
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // TargetDao target = applicationContext.getBean("target", TargetDao.class);
        // target.save();
    }
    
    @Test
    public void aopannotationTest() {
        targetDao.save();
    }
}