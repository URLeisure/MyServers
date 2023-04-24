package firstlesson.simple;


import org.testng.annotations.Test;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/02/27 8:44
 **/

public class MyTest {
    @Test
    public void test1(){
        Product a = SimpleFactory.getProduct("A");
        System.out.println(a);
    }


}
