package com.example.springbootjpadesign.Service;
import com.example.springbootjpadesign.Entity.Course;
import com.example.springbootjpadesign.Entity.Elective;
import com.example.springbootjpadesign.Repository.CourseRepository;
import com.example.springbootjpadesign.Repository.ElectiveRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ElectiveRepository electiveRepository;
    //添加课程
    public void addCourse(Course course){
        courseRepository.save(course);

    }
    public List<Course> courseList(){
        return courseRepository.findAll();
    }
    public void deleteCourse(int id){
        courseRepository.deleteById(id);
    }
    public void getCourses(int Id){
        courseRepository.findById(Id).orElse(null);
    }
    public void UpdateCourse(Course course){
        courseRepository.save(course);

    }

    /*
    *elective
    * 添加
    * 删除
    * 按照sid或者cid查询elective表
     */

   public void addElective(Elective elective){
       electiveRepository.save(elective);

   }
   public void getElective(int id){
       electiveRepository.findById(id).orElse(null);

   }
   public void deleteElective(int id){
       electiveRepository.deleteById(id);
   }

   public List<Elective>electives(int sid){
       return electiveRepository.findElectiveByStudentId(sid).orElse(List.of());
   }
   public List<Elective>electiveList(int cid){
       return (List<Elective>) electiveRepository.findElectiveByCourseId(cid).orElse(null);

   }


}