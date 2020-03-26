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
public class StudentCourseTest {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_addstudentcourse(){
        Student student01=new Student();
        student01.setName("姚世维");
        manager.persist(student01);

        Student student02=new Student();
        student02.setName("黄娇");
        manager.persist(student02);

        Course course01=new Course();
        course01.setName("web框架");
        manager.persist(course01);

        Course course02=new Course();
        course02.setName("web开发技术");
        manager.persist(course02);
    }
    @Test
    public void test_rel(){
        Student student01=manager.find(Student.class,1);
        Course course01=manager.find(Course.class,1);
        Elective elective=new Elective();
        elective.setDetail("因为热爱");
        elective.setCourse(course01);
        elective.setStudent(student01);
        manager.persist(elective);
    }
}
