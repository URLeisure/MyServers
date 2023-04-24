package firstlesson.factory;

/**
 * @author: URLeisure
 * @description: TODO 工厂（方法）模式
 * @create: 2023/02/27 9:11
 **/

public interface Factory {
    Phone createPhone(String str);
}

class IPhoneFactory implements Factory{
    @Override
    public Phone createPhone(String str) {
        System.out.println("IPhone");
        return new IPhone();
    }
}

class HuaweiFactory implements Factory{
    @Override
    public Phone createPhone(String str) {
        System.out.println("Huawei");
        return new HuaweiPhone();
    }
}

