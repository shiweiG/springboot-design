package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends BaseRepository<Student,Integer> {
}
