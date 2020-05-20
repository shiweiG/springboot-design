package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Elective;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ElectiveRepository extends BaseRepository<Elective,Integer> {
    /*
    删除指定id选课记录
     */
    @Modifying
    @Transactional
    @Query("delete from Elective e where e.course.id=:cid")
    void remove(@Param("cid")int cid);

}
