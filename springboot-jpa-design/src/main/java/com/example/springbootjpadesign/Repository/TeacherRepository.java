package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher,Integer> {
}
