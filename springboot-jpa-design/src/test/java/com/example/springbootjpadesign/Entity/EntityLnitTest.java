package com.example.springbootjpadesign.Entity;

import com.example.springbootjpadesign.Repository.*;
import com.example.springbootjpadesign.Repository.TeacherRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PrimaryKeyJoinColumn;
import java.security.PrivateKey;
import java.util.PrimitiveIterator;

@SpringBootTest
@Transactional
@Slf4j
@Rollback(value = false)
public class EntityLnitTest {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private EntityManager manager;
    @Autowired
    private UserRepository userRepository;
    @Test
    //初始学生
    public void test_student(){
        Student s1=new Student();
        s1.setName("黄娇");
        Student s2=new Student();
        s2.setName("姚世维");

        studentRepository.save(s1);
        studentRepository.save(s2);

    }
    @Test
    public void test_course(){
        Course c1=new Course();
        c1.setName("数据库");
        c1.setCredits(1.0);
        Course c2=new Course();
        c2.setName("web框架");
        c2.setCredits(2.5);

        courseRepository.save(c1);
        courseRepository.save(c2);
    }
    @Test
    public void test_teacher(){
        Teacher t1=new Teacher();
        t1.setName("sun");
        Teacher t2=new Teacher();
        t2.setName("娇");
        teacherRepository.save(t1);
        teacherRepository.save(t2);
    }


    @Test
    public void test_course_teacher(){
        Course c1=manager.find(Course.class,1);
        Course c2=manager.find(Course.class,2);
        Teacher t1=manager.find(Teacher.class,1);
        Teacher t2=manager.find(Teacher.class,2);
        c1.setTeacher(t1);
        c2.setTeacher(t2);

    }
    @Test
    public void test_elective(){
        Student student=manager.find(Student.class,1);
        Course course=manager.find(Course.class,1);
        Elective elective=new Elective();
        elective.setGrade(60);
        elective.setDetail("因为爱");
        elective.setCourse(course);
        elective.setStudent(student);
        manager.persist(elective);
    }
    @Test
    public void test_user(){
        User user=new User();
        user.setName("bo");
        userRepository.save(user);

    }
}
