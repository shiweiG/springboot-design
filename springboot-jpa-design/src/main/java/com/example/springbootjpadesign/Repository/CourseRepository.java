package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends BaseRepository<Course,Integer> {
}

