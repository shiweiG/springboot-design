package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Course;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CourseRepository extends BaseRepository<Course,Integer> {

    Optional<List<Course>>findByTeacher_id(int tid);
    Optional<List<Course>>findById(int id);



}

