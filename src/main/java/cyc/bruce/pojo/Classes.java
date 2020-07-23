package cyc.bruce.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/22 4:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    //定义实体类的属性，与class表中的字段对应
    private int id;            //id===>c_id
    private String name;    //name===>c_name

    /**
     * class表中有一个teacher_id字段，所以在Classes类中定义一个teacher属性，
     * 用于维护teacher和class之间的一对一关系，通过这个teacher属性就可以知道这个班级是由哪个老师负责的
     */
    private Teacher teacher;
    private List<Student> students;
}
