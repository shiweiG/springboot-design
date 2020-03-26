package com.example.springbootjpadesign.Entity;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class TeacherCourseTest {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_teacher_course(){
       Teacher teacher1=new Teacher();
       teacher1.setName("王波");
       manager.persist(teacher1);

        Course course01=new Course();
        course01.setName("web框架");
        manager.persist(course01);

        Course course02=new Course();
        course02.setName("web开发技术");
        manager.persist(course02);
    }
    @Test
    public void test_rel2(){
     Teacher teacher1=manager.find(Teacher.class,1);
     Course course01=manager.find(Course.class,1);
     course01.setTeacher(teacher1);

     Course course02=manager.find(Course.class,2);
     course02.setTeacher(teacher1);

    }
}
