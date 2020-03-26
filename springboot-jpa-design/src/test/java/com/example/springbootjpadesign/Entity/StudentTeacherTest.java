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
public class StudentTeacherTest {
    @Autowired
    private EntityManager manager;
    @Test
    public void test_student_teacher(){
     Student student1=new Student();
     student1.setName("黄娇");
     manager.persist(student1);

     Student student2=new Student();
     student2.setName("姚世维");
     manager.persist(student2);

     Teacher teacher1=new Teacher();
     teacher1.setName("王波");
     manager.persist(teacher1);
    }
    @Test
    public void test_rel1(){
     Student  student01=manager.find(Student.class,1);
     Teacher teacher1=manager.find(Teacher.class,1);
     student01.setTeacher(teacher1);

     Student student02=manager.find(Student.class,2);
     student02.setTeacher(teacher1);
    }
}
