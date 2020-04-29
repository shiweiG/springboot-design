package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends BaseRepository<User,Integer> {
    @Query("from User u where u.number=:num")
    User find(@Param("num") int num);
}
