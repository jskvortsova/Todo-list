//package com.example.demo.services.impl;
//
//import com.example.demo.entity.Task;
//import com.example.demo.repository.TaskRepository;
//import com.example.demo.services.TaskService;
//import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
//
//public class TaskServiceImpl implements TaskService {
//
//    @Autowired
//    private TaskRepository taskRepository;
//
//
//    @Override
//    public Task addTask(Task task) {
//        Task savedTask = taskRepository.saveAndFlush(task);
//        return savedTask;
//    }
//
//    @Override
//    public void delete(int id) {
//        taskRepository.delete(taskRepository.getOne(id));
//    }
//
//    @Override
//    public Task getByName(String name) {
//        return taskRepository.findByName(name);
//    }
//
//    @Override
//    public Task editTask(Task task) {
//        return taskRepository.saveAndFlush(task);
//    }
//
//    @Override
//    public List<Task> getAll() {
//        return taskRepository.findAll();
//    }
//}
