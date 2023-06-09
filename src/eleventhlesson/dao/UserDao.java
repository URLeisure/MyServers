package eleventhlesson.dao;

import eleventhlesson.entity.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 扑腾的江鱼
 * @description: TODO 类描述
 * @create: 2023/05/15 8:27
 **/
@Resource
public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(int id);

    int selectCount();

    User findUserInfo(int userid);

    List<User> findAllUser();
}
