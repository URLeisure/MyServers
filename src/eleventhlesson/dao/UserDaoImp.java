package eleventhlesson.dao;

import eleventhlesson.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * @author: 扑腾的江鱼
 * @description: TODO 类描述
 * @create: 2023/05/15 8:28
 **/
@Repository
public class UserDaoImp implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into user values(?,?,?)";
        Object[] args = {user.getUserId(),user.getUsername(),user.getUstatus()};
        int updata = jdbcTemplate.update(sql,user.getUserId(),user.getUsername(),user.getUstatus());
        System.out.println(updata);
    }
}
