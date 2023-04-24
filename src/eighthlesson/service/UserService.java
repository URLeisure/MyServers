package eighthlesson.service;

import eighthlesson.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: URLeisure
 * @description: 注解 bean
 * @create: 2023/04/21 18:20
 **/

@Component(value = "userService")
//@Component("userService")
public class UserService {

    @Autowired
    @Qualifier(value = "userDaoImp")

    private UserDao userDao;
    public void fun(){
        userDao.add();
        System.out.println("UserService: 你好！");
        System.out.println(str);
    }
    @Value("xxx")
    private String str;
}
