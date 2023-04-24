package fourthandfifthlesson;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/20 8:14
 **/

public class UserService {

    public void execute() {
        UserDao userdao = UserFactory.createDao();
    }
}

class UserFactory{
    public static UserDao createDao() {
        return new UserDao();
    }
}
