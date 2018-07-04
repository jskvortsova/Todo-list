package com.example.demo.services;

import com.example.demo.entity.Task;


import java.util.List;

public interface TaskService {
    Task addTask(Task task);
    void delete(int id);
    Task getByName(String name);
    Task editTask(Task task);
    List<Task> getAll();
}
