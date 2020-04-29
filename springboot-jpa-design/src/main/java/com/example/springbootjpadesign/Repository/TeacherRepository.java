package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Student;
import com.example.springbootjpadesign.Entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Integer> {

}
