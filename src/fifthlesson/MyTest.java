package fifthlesson;

import fifthlesson.server.UserService;
import fifthlesson.spring5.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/27 8:50
 **/

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("fifthlesson/bean2.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.execute();
        System.out.println(userService);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("fifthlesson/bean2.xml");
        Emp emp = (Emp)applicationContext.getBean("emp");
        System.out.println(emp.toString());
    }
}
