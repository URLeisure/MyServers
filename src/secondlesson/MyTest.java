package secondlesson;

import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/06 8:23
 **/

public class MyTest {

    @Test
    public void test1() {
        Person person = new Person();
        person.age = 18;
        try {
            test2(person);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public void test2(Object object) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        if(object instanceof Person){
//            Person person = (Person)object;
//            System.out.println(person.age);
//        }
        Class<?> aClass = object.getClass();
        Field field = aClass.getDeclaredField("age");
        int age = field.getInt(object);
        System.out.println(age);
        Method method = aClass.getDeclaredMethod(("sayHello"));
        method.setAccessible(true);
        method.invoke(object);
    }

    @Test
    public void test3(){
        Person person = new Person();
        person.sayHello();
    }
}
