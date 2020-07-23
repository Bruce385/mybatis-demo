package cyc.bruce.dao;

import cyc.bruce.pojo.Classes;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/22 4:54
 */
public interface ClassesMapper {
    Classes getClassById(int id);

    List<Classes> getClassList();

    int addClass(Classes classes);

    int updateClass(Classes classes);

    int deleteClass(int id);
}
