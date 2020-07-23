package cyc.bruce.dao;

import cyc.bruce.pojo.User;

import java.util.List;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/19 2:21
 */
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}
