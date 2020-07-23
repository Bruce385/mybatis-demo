package cyc.bruce.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/23 18:42
 */
@Data
@AllArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
