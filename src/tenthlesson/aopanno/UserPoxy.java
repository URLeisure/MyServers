package tenthlesson.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/24 9:20
 **/
@Component
@Aspect
public class UserPoxy {
    @Before(value = "execution(* tenthlesson.aopanno.User.add(..))")
    public void before(){
        System.out.println("before in UserPoxy.");
    }
    @After(value = "execution(* tenthlesson.aopanno.User.add(..))")
    public void after(){
        System.out.println("after in UserPoxy.");
    }

    //异常通知
    @AfterThrowing(value = "execution(* tenthlesson.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing in UserPoxy");
    }

    @AfterReturning(value = "execution(* tenthlesson.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning in UserPoxy");
    }

    @Around(value = "execution(* tenthlesson.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后");
    }
}
