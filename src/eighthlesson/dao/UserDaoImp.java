package eighthlesson.dao;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/21 18:43
 **/

@Repository("userDaoImp")
public class UserDaoImp implements UserDao{
    @Override
    public void add() {
        System.out.println("add");
    }
}
