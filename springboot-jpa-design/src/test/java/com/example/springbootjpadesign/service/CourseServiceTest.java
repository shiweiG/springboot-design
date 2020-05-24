package com.example.springbootjpadesign.service;

import com.example.springbootjpadesign.Repository.CourseRepository;
import com.example.springbootjpadesign.Service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@Slf4j
@Transactional
public class CourseServiceTest {
    @Autowired
    private CourseService courseService;
    @Test
    public void test_course(){
       courseService.deleteCourse(1);



    }
}
