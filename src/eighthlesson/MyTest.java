package eighthlesson;

import eighthlesson.config.SpringConfig;
import eighthlesson.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/21 18:23
 **/

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("eighthlesson/bean6.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.fun();
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.fun();
    }
}
