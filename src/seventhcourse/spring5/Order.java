package seventhcourse.spring5;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/10 8:17
 **/

public class Order {
    private String name;

    public Order() {
        System.out.println("1. 无参构造方法bean实例");
    }

    public void setName(String name) {
        System.out.println("2. set方法执行");
        this.name = name;
    }

    public void initMethod() {
        System.out.println("3. 执行初始化方法");
    }

    public void destroyMethod() {
        System.out.println("5. 销毁方法");
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                '}';
    }
}
