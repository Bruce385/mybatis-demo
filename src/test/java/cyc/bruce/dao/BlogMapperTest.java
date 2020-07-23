package cyc.bruce.dao;

import cyc.bruce.pojo.Blog;
import cyc.bruce.utils.IdUtil;
import cyc.bruce.utils.MybatisUtil;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/23 19:07
 */
public class BlogMapperTest {
    private SqlSession sqlSession;
    private BlogMapper blogMapper;

    @Before
    public void setup() {
        sqlSession = MybatisUtil.getSqlSession();
        blogMapper = sqlSession.getMapper(BlogMapper.class);
    }

    @After
    public void teardown() {
        sqlSession.close();
    }

    @Test
    public void addBlog() {
        Blog blog = new Blog(IdUtil.getId(), "数据库通用", "cyc", new Date(), 2000);
        blogMapper.addBlog(blog);
        blog.setId(IdUtil.getId());
        blog.setTitle("Html5网页");
        blog.setCreateTime(new Date());
        blogMapper.addBlog(blog);
        sqlSession.commit();
    }

    @Test
    public void getBlogListByCondition() {
        Map<String, Object> map = new HashMap();
        map.put("title", "%spring%");
        map.put("author", "%陈毅超%");
        map.put("views", 200);
        List<Blog> blogListByCondition = blogMapper.getBlogListByCondition(map);
        for (Blog blog : blogListByCondition) {
            System.out.println(blog);
        }
    }

    @Test
    public void updateBlog() {
        Map<String, Object> map = new HashMap();
        map.put("views", 2333);
        List<Blog> blogList = blogMapper.getBlogListByCondition(map);
        System.out.println(blogList);
        for (Blog blog : blogList) {
            map.put("id", blog.getId());
           // map.put("title", "Spring实战");
//            map.put("author", "bruce");
//            map.put("views", 8888);
            blogMapper.updateBlog(map);
        }
        sqlSession.commit();
    }

}
