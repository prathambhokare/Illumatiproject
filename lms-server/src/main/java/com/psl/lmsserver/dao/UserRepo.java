package com.psl.lmsserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.lmsserver.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Integer>{


    @Query("Select u from User as u where u.email=:n")
    public User getUserByEmailId(@Param("n") String email_id);



    @Query("Select u from User as u where u.name=:n")
    public User getUserByName(@Param("n") String name);


    @Query("Select u from User as u where u.userId=:id")
    public User getUserById(@Param("id") int userId);




    @Query("Select u from User as u where u.name like %:keyword%")
    List<User> findByKeyword(@Param("keyword") String keyword);
}
