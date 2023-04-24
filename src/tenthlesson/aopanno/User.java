package tenthlesson.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/24 9:19
 **/
@Component
public class User {
    public void add(){
        System.out.println("add in User.");
    }
}
