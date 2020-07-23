package cyc.bruce.dao;

import cyc.bruce.pojo.User;
import cyc.bruce.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/19 4:32
 */
public class UserMapperTest {
    private UserMapper userMapper;
    private SqlSession sqlSession;

    @Before
    public void setup() {
        sqlSession = MybatisUtil.getSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void getUserList() {
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user.getUserid() + "\t" + user.getUsername() + "\t" + user.getSex() + "\t" + user.getAge());
        }
    }

    @Test
    public void getUserById() {
        User user = userMapper.getUserById(11);
        System.out.println(user.getUserid() + "\t" + user.getUsername() + "\t" + user.getSex() + "\t" + user.getAge());
    }

    @Test
    public void addUser() {
        System.out.println(userMapper.addUser(new User(null, "小行星", "女", 20)));
        sqlSession.commit();
    }

    @Test
    public void updateUser(){
        System.out.println(userMapper.updateUser(new User("18", "京津冀", "男", 28)));
        sqlSession.commit();
    }

    @Test
    public void deleteUser(){
        System.out.println(userMapper.deleteUser(25));
        sqlSession.commit();
    }

    @After
    public void teardown() {
        sqlSession.close();
    }
}
