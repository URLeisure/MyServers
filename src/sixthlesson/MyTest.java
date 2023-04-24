package sixthlesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import sixthlesson.spring5.Book;
import sixthlesson.spring5.Course;
import sixthlesson.spring5.Stu;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/03 8:22
 **/

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sixthlesson/bean3.xml");
        Stu stu = (Stu) applicationContext.getBean("stu");

        System.out.println(stu.toString());
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sixthlesson/bean3.xml");
        Book book = (Book) applicationContext.getBean("book");
        System.out.println(book.toString());
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sixthlesson/bean3.xml");
        Course myBean = (Course) applicationContext.getBean("mybean");

        System.out.println(myBean);

    }
    @Test
    public void test4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sixthlesson/bean3.xml");
        Book book1 = (Book) applicationContext.getBean("book");
        Book book2 = (Book) applicationContext.getBean("book");
        System.out.println(book1);
        System.out.println(book2);
    }
}
