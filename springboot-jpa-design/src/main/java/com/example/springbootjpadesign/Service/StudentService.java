package com.example.springbootjpadesign.Service;

import com.example.springbootjpadesign.Entity.Student;
import com.example.springbootjpadesign.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public void addStudent(Student student){
        studentRepository.save(student);

    }
}
