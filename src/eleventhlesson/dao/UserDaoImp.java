package eleventhlesson.dao;

import eleventhlesson.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


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

    @Override
    public void update(User user) {
        String sql = "update user set username=?, ustatus=? where userid=?";
        Object[] args ={user.getUsername(),user.getUstatus(),user.getUserId()};
        int date = jdbcTemplate.update(sql,args);
        System.out.println(date);
    }

    @Override
    public void delete(int id) {
        String sql = "delete from user where userid = ?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    public int selectCount(){
        String sql = "select count(*) from user";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    @Override
    public User findUserInfo(int userid) {
        String sql = "select * from user where userid = ?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),userid);
        return user;
    }

    @Override
    public List<User> findAllUser() {
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
        return list;
    }
}
