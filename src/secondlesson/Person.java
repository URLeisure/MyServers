package secondlesson;

/**
 * @author: URLeisure
 * @description: TODO 反射 and 注解
 * @create: 2023/03/06 8:21
 **/
@MyAnnotation
public class Person {
    int age;

    @Deprecated //表示废弃
    @SuppressWarnings("all") //取消所有警告
    public void sayHello(){
        System.out.println("Hello");
    }

    @MyAnnotation
    public void tt(){

    }
    @Override
    public String toString(){
        return "Person";
    }
}
