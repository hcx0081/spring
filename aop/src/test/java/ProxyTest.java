import com.spring.proxy.App;
import com.spring.proxy.Target;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * {@code @Description:}
 */
public class ProxyTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Target target = context.getBean(Target.class);
        target.method1();
        /* 失效情况 */
        // method1环绕前增强。。。
        // 执行method2
        // method1环绕后增强。。。

        /* 没有失效情况 */
        // method1环绕前增强。。。
        // method2环绕前增强。。。
        // 执行method2
        // method2环绕后增强。。。
        // 执行method1
        // method1环绕后增强。。。
    }
}
