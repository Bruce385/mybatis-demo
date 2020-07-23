package cyc.bruce.dao;

import cyc.bruce.pojo.Classes;
import cyc.bruce.pojo.Teacher;
import cyc.bruce.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/7/22 4:59
 */
public class ClassesMapperTest {
    private ClassesMapper classesMapper;
    private TeacherMapper teacherMapper;
    private SqlSession sqlSession;

    @Before
    public void setup() {
        sqlSession = MybatisUtil.getSqlSession();
        classesMapper = sqlSession.getMapper(ClassesMapper.class);
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void teardown() {
        sqlSession.close();
    }

    @Test
    public void getClassesById() {
        Classes classes = classesMapper.getClassById(2);
        System.out.println(classes);
    }

    @Test
    public void getClassesList() {
        List<Classes> classes = classesMapper.getClassList();
        System.out.println(classes);
    }

    @Test
    public void addClass() {
        Teacher teacher = teacherMapper.getTeacherById(1);
        Classes classes = new Classes(0, "吧唧", teacher, null);
        classesMapper.addClass(classes);
        sqlSession.commit();
    }

    @Test
    public void updateClass() {
        Teacher teacher = teacherMapper.getTeacherById(1);
        Classes classes = new Classes(8, "八级", teacher, null);
        System.out.println(classesMapper.updateClass(classes));
        sqlSession.commit();
    }
}
