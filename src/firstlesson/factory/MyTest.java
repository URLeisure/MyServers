package firstlesson.factory;

import org.testng.annotations.Test;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/02/27 9:19
 **/

public class MyTest {
    @Test
    public void test(){
        Factory huawei = new HuaweiFactory();
        Phone huawei1 = huawei.createPhone("huawei");
    }
}
