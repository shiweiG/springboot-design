package com.example.springbootjpadesign.Service;

import com.example.springbootjpadesign.Entity.Teacher;
import com.example.springbootjpadesign.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudentService studentService;
    //添加教师
    public void addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
    //按照姓名查询教师
    public Teacher getTeacher(String name){
        return teacherRepository.findTeacherByName(name).orElse(null);
    }
    //查询所有教师
    public List<Teacher>teacherList(){
        return teacherRepository.findAll();
    }
    //删除教师
    public void deleteTeacher(int id){
        teacherRepository.deleteById(id);
    }



}
