package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends BaseRepository<Student,Integer> {
   Optional<Student>findStudentByStudentNo(String studentNo);

   Optional<Student>findStudentByName(String sname);

   Optional<List<Student>>findStudentByTeacherId(int tid);

   Optional<List<Student>>findStudentByElectives(int cid);




}
