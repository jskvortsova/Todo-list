package com.example.demo.services;

import com.example.demo.dao.UserDto;
import com.example.demo.entity.User;

import java.text.ParseException;
import java.util.List;

public interface UserService {
    User addUser(UserDto userDto);
    void delete(Integer id);
    User getByName(String name);
    User getById(Integer id);
    User editUser(UserDto userDto);
    List<User> getAll();
    UserDto convertToDto(User user);
    User convertToEntity(UserDto userDto);
}
