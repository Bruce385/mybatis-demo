package cyc.bruce.dao;

import cyc.bruce.pojo.Teacher;

import java.util.List;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/23 3:06
 */
public interface TeacherMapper {
    Teacher getTeacherById(int id);

    List<Teacher> getTeacherList();
}
