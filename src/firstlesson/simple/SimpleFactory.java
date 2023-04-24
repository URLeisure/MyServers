package firstlesson.simple;

/**
 * @author: URLeisure
 * @description: TODO 简单工厂模式
 * @create: 2023/02/27 8:33
 **/

public class SimpleFactory {

    public static Product getProduct(String str){
        if(str.equals("A")){
            return new ProductA();
        }else{
            return new ProductB();
        }
    }
}
