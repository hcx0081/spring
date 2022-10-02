import com.spring.aopxml.TargetDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
    
    // @Resource(name = "target")
    @Autowired
    private TargetDao target;// 一定要使用接口注入
    
    @Test
    public void aopxmlTest() {
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // TargetDao target = applicationContext.getBean("target", TargetDao.class);
        target.save();
    }
    
    @Autowired
    private com.spring.aopannotation.TargetDao targetDao;// 一定要使用接口注入
    
    @Test
    public void aopannotationTest() {
        targetDao.save();
    }
    
}
