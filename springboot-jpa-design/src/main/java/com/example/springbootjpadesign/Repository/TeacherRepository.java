package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Student;
import com.example.springbootjpadesign.Entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Integer> {
  //按照姓名查询老师
  Optional<Teacher>findTeacherByName(String name);

  //按照id查询老师
    Optional<Teacher>findByTeacherId(int id);





}
