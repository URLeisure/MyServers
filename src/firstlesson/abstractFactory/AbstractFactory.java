package firstlesson.abstractFactory;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/02/27 9:29
 **/

public interface AbstractFactory {
    Phone createPhone();

    Mask createMask();
}

class SuperFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        System.out.println("Phone");
        return new IPhone();
    }

    @Override
    public Mask createMask() {
        System.out.println("N95");
        return new N95();
    }

}

