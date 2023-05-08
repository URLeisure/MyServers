package tenthlesson.aopanno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/05/08 8:55
 **/

@Component
@Aspect
@Order(1)
public class PersonProxy {
    @After(value =  "execution(* tenthlesson.aopanno.User.add(..))")
    public void after(){
        System.out.println("after in PersonPoxy.");
    }

}
