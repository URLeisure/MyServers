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
}
