package cyc.bruce.dao;

import cyc.bruce.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/23 18:48
 */
public interface BlogMapper {

    int addBlog(Blog blog);

    int updateBlog(Map map);

    List<Blog> getBlogListByCondition(Map map);

}
