package com.example.springbootjpadesign.Service;

import com.example.springbootjpadesign.Entity.Teacher;
import com.example.springbootjpadesign.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TercherService {
    @Autowired
    private TeacherRepository teacherRepository;
    //添加教师
    public void addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
}
