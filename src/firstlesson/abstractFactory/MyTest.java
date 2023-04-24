package firstlesson.abstractFactory;

import org.testng.annotations.Test;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/02/27 9:32
 **/

public class MyTest {

    @Test
    public void test(){
        AbstractFactory abstractFactory = new SuperFactory();
        Mask mask = abstractFactory.createMask();
    }
}
