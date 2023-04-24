package fifthlesson.server;

import fifthlesson.dao.UserDao;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/27 8:30
 **/

public class UserService {
    private UserDao userDao;

    public void execute(){
        userDao.add();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
