package firstlesson.simple;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/02/27 8:33
 **/

public class Main {
    
    public static void main(String[] args) {
        Product a = SimpleFactory.getProduct("A");

        System.out.println(a);
    }
    
}
