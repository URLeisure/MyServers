package eleventhlesson.service;

import eleventhlesson.dao.UserDao;

import eleventhlesson.entity.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 扑腾的江鱼
 * @description: TODO 类描述
 * @create: 2023/05/15 8:27
 **/
@Component
public class UserService {
    @Resource
    private UserDao userDao;

    public void addUser(User user) {
        userDao.add(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(int id) {
        userDao.delete(id);
    }

    public int findeCount() {
        return userDao.selectCount();
    }

    public User findUser(int userid) {
        return userDao.findUserInfo(userid);
    }

    public List<User> findAll(){
        return userDao.findAllUser();
    }
}
