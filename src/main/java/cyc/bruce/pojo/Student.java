package cyc.bruce.pojo;

import lombok.Data;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/22 5:58
 */
@Data
public class Student {
    private int id;            //id===>s_id
    private String name;    //name===>s_name
    private Classes classes;
}
