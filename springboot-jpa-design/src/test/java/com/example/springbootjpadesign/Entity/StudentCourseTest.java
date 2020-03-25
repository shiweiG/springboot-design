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
        student01.setName("陈俊伯");
        manager.persist(student01);

        Student student02=new Student();
        student02.setName("谭文韬");
        manager.persist(student02);

        Course course01=new Course();
        course01.setName("web框架");
        manager.persist(course01);

        Course course02=new Course();
        course02.setName("软件工程导论");
        manager.persist(course02);
    }

}
