//package com.example.demo.repository;
//
//import com.example.demo.entity.Task;
//import com.example.demo.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface TaskRepository extends JpaRepository<Task, Integer> {
//    @Query("select t from Task t where t.name = :name")
//    Task findByName(@Param("name") String name);
//}
