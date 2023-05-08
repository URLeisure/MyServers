package tenthlesson;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import tenthlesson.aopanno.User;
import tenthlesson.aopxml.Food;
import tenthlesson.config.AopConfig;
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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tenthlesson/bean8.xml");
        User user = applicationContext.getBean("user", User.class);
        user.add();
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = applicationContext.getBean("user", User.class);
        user.add();
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tenthlesson/aopxml/bean9.xml");
        Food food = applicationContext.getBean("food", Food.class);
        food.buy();
    }
}
