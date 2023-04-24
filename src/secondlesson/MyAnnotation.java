package secondlesson;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: URLeisure
 * @description: TODO 定义注解
 * @create: 2023/03/06 9:19
 **/
@Target(value = {ElementType.TYPE_USE, ElementType.METHOD, ElementType.MODULE})
@Retention(RetentionPolicy.SOURCE)
//@Target(value = ElementType.METHOD) //此注解只在方法上有效
public @interface MyAnnotation {
    String name() default "";
}

