package com.example.springbootjpadesign.controller;
import com.example.springbootjpadesign.Service.CourseService;
import com.example.springbootjpadesign.Service.StudentService;
import com.example.springbootjpadesign.Service.TeacherService;
import com.example.springbootjpadesign.component.RequestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teacher/")
public class TeacherController {
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private CourseService courseService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private RequestComponent requestComponent;
    @Autowired
    private TeacherService teacherService;

   

}
