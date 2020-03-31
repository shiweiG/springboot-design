package com.example.springbootjpadesign.Entity;

import com.example.springbootjpadesign.Repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Rollback(value = false)
@Transactional
public class CourseTest {
    @Autowired
    private CourseRepository courseRepository;
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

}
