package edu.teaching.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import edu.teaching.mybatis.pojo.Student;

public class TestStudentMapper {
    SqlSession session;

    @Before
    public void init(){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }

    @Test
    public void testSelectAllStudents(){
        // 完整命名空间.id
        String statementId = "edu.teaching.mybatis.mapper.StudentMapper.selectAllStudents";
        List<Student> students = session.selectList(statementId);
        for (Student stu : students) {
            System.out.println(stu);
        }
        session.close();
    }
}
