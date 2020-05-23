package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Direction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DirectionRepository extends BaseRepository<Direction ,Integer> {

   // 查询老师指定方向

   Optional<List<Direction>>findDirectionByName(String name);
   Optional<List<Direction>>findByStudentId(String sid);



}

