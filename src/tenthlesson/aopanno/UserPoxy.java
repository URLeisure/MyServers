package tenthlesson.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/24 9:20
 **/
@Component
@Aspect
@Order(2)
public class UserPoxy {

    @Pointcut(value = "execution(* tenthlesson.aopanno.User.add(..))")
    public void point(){

    }
    @Before(value = "point()")
    public void before(){
        System.out.println("before in UserPoxy.");
    }
    @After(value = "point()")
    public void after(){
        System.out.println("after in UserPoxy.");
    }

    //异常通知
    @AfterThrowing(value = "point()")
    public void afterThrowing(){
        System.out.println("afterThrowing in UserPoxy");
    }

    @AfterReturning(value = "point()")
    public void afterReturning(){
        System.out.println("afterReturning in UserPoxy");
    }

    @Around(value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");
    }
}
