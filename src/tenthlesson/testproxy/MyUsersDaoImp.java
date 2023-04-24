package tenthlesson.testproxy;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/04/24 8:22
 **/

public class MyUsersDaoImp implements MyUserDao {


    @Override
    public int add(int i, int j) {
        return i+j;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
