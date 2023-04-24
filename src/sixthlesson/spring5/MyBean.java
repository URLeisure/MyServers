package sixthlesson.spring5;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: URLeisure
 * @description: FactoryBean
 * @create: 2023/04/03 9:08
 **/

public class MyBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("王五");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
