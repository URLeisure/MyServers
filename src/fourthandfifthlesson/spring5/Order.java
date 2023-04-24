package fourthandfifthlesson.spring5;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/20 9:12
 **/

public class Order {

    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Order(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
