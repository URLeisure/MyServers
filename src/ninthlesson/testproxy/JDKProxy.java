package ninthlesson.testproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/24 8:35
 **/

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {MyUserDao.class};
        Proxy.newProxyInstance(MyUsersDaoImp.class.getClassLoader(), interfaces, new MyUserDaoProxy());


    }
}

class MyUserDaoProxy implements InvocationHandler{

    public Object object;

    public MyUserDaoProxy(){}

    public MyUserDaoProxy(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("新加入的功能，在原方法之前执行" + method.getName() + ",所传参数" + Arrays.toString(args));

        Object res = method.invoke(object,args);

        System.out.println("新加入的功能，在原方法之后执行" + object);
        return res;
    }
}
