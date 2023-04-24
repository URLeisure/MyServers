package seventhcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import seventhcourse.spring5.EMP;
import seventhcourse.spring5.Order;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/10 8:19
 **/

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("seventhcourse/bean4.xml");
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println("4. 获取到了bean实例");
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("seventhcourse/bean4.xml");
        EMP emp = applicationContext.getBean("emp", EMP.class);
        System.out.println(emp);
    }

    @Test
    public void test3() {

    }
}

