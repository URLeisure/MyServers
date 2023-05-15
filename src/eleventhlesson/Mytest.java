package eleventhlesson;

import eleventhlesson.entity.User;

import eleventhlesson.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author: 扑腾的江鱼
 * @description: TODO 类描述
 * @create: 2023/05/15 8:47
 **/

public class Mytest {

    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("eleventhlesson/bean10.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(4);
        user.setUsername("java");
        user.setUstatus("alive");
        userService.addUser(user);
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("eleventhlesson/bean10.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        User user = new User();
        user.setUserId(4);
        user.setUsername("update");
        user.setUstatus("success");
        userService.updateUser(user);
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("eleventhlesson/bean10.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        int userid = 4;
        userService.deleteUser(userid);
    }

    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("eleventhlesson/bean10.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        System.out.println(userService.findeCount());
    }

    @Test
    public void test5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("eleventhlesson/bean10.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        int userid = 24;
        User user = userService.findUser(userid);

        System.out.println(user.getUsername() + " " + user.getUstatus());
    }

    @Test
    public void test6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("eleventhlesson/bean10.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.findAll().forEach(c -> System.out.println(c.getUserId() + " " + c.getUsername() + " "+c.getUstatus()));
    }
}
