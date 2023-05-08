package tenthlesson.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: 扑腾的江鱼
 * @description: TODO 类描述
 * @create: 2023/05/08 9:01
 **/

@Configuration
@ComponentScan(basePackages = {"tenthlesson.aopanno"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
