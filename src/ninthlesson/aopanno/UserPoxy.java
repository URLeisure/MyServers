package ninthlesson.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/24 9:20
 **/
@Component
@Aspect
public class UserPoxy {
    public void before(){
        System.out.println("before in UserPoxy.");
    }

}
