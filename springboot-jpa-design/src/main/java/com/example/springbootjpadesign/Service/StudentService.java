package com.example.springbootjpadesign.Service;

import com.example.springbootjpadesign.Entity.Student;
import com.example.springbootjpadesign.Entity.Teacher;
import com.example.springbootjpadesign.Repository.StudentRepository;
import com.example.springbootjpadesign.Repository.TeacherRepository;
import org.apache.coyote.OutputBuffer;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private StudentService studentService;
    public List<Student>getAllStudent(){
        return studentRepository.findAll();
    }

    public Teacher getTeacher(int sid){
        return studentRepository.findById(sid).orElse(new Student()).getTeacher();

    }
    public Student getStudent(int sid){
        return studentRepository.findById(sid).orElse(null);
    }
    public Student getStudent(String name){
        return studentRepository.findStudentByName(name).orElse(null);
    }
    public List<Student>studentList(int tid){
        return studentRepository.findStudentByTeacherId(tid).orElse(List.of());
    }
    public List<Student>studentList1(int cid){
        return studentRepository.findStudentByElectives(cid).orElse(List.of());
    }
    public Student updateStudent(Student student){
        studentRepository.save(student);
        return student;
    }

    public Student getStudentNo(String studentNo){
        return studentRepository.findStudentByStudentNo(studentNo).orElse(null);

    }
    //统计学生人数
    public int SumStudent(int tid){
        return studentService.studentList(tid).size();
    }
}
