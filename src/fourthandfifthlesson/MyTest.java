package fourthandfifthlesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import fourthandfifthlesson.spring5.Book;
import fourthandfifthlesson.spring5.Order;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/20 8:55
 **/

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("fourthandfifthlesson/bean1.xml");
        Book book = applicationContext.getBean("book",Book.class);

        System.out.println(book);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("fourthandfifthlesson/bean1.xml");
        Order order = applicationContext.getBean("order",Order.class);

        System.out.println(order);
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("fourthandfifthlesson/bean1.xml");
        Book book1 = applicationContext.getBean("book1",Book.class);

        System.out.println(book1);
    }
}
