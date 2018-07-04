package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository <User, Integer> {

    @Query("select u from User  u where u.name = :name")
    default User findByName(@Param("name") String name) {
        return null;
    }

    User getById(Integer id);

}
