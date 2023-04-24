package eighthlesson.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/21 19:01
 **/
@Configuration
@ComponentScan(basePackages = {"eighthlesson.service","eighthlesson.dao"})
public class SpringConfig {

}
