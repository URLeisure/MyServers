package tenthlesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import tenthlesson.aopanno.User;
import tenthlesson.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/05/08 8:21
 **/

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = applicationContext.getBean("user", User.class);
        user.add();
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tenthlesson/bean8.xml");
        User user = applicationContext.getBean("user", User.class);
        user.add();
    }
}
