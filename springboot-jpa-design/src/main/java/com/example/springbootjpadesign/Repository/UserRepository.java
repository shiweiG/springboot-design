package com.example.springbootjpadesign.Repository;

import com.example.springbootjpadesign.Entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends BaseRepository<User,Integer> {

    Optional<User> findByUserId(int num);

    Optional<User> findByName(String name);

   /* @Query("from User u where u.number=:num")
    User find(@Param("num") int num);
    */


}
