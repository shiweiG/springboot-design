package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Direction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DirectionRepository extends BaseRepository<Direction ,Integer> {
    /*
    查询老师指定方向
     */
    @Query("from Direction d where d.name=:dname and d.id=:tid")
    List<Direction>findByNameAndId(@Param("dname")String dname,@Param("tid")int tid);
}

