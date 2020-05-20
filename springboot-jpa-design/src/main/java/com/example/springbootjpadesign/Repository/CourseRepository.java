package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Course;
import org.hibernate.mapping.Set;
import org.hibernate.sql.Update;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface CourseRepository extends BaseRepository<Course,Integer> {
   /*
   查询教师指定课程
    */
    @Query("from Course c where c.id=:cid and c.teacher.id=:tid")
    Course find(@Param("cid") int cid, @Param("tid") int tid);

    @Query("select c from Course c where c.teacher.id=:tid")
    Page<Course>list(@Param("tid")int tid, Pageable pageable);
   /*
   按照姓名更新学分
    */
    @Modifying
    @Query("update  Course  c set c.credits=:credits,c.name=:cname where c.id=:cid")
   int update(@Param("cid")int cid,@Param("credits")double credits,@Param("cname")String name);
   /*
   更新最高分和最低分
    */
    @Modifying
    @Query("update Course c set c.low_score=:low_score,c.max_score=:max_score where c.id=:cid")
    int update(@Param("low_score")double low_score,@Param("max_score") String max_score,@Param("cid")int cid);


}

