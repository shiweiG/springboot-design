package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.Elective;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public interface ElectiveRepository extends BaseRepository<Elective,Integer> {
 Optional<List<Elective>>findElectiveByCourseId(int cid);
 Optional<List<Elective>>findElectiveByStudentId(int sid);



}
