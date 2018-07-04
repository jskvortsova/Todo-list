package com.example.demo.services.impl;
import com.example.demo.dao.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

        @Autowired
        private UserRepository userRepository;

        @Autowired
        private ModelMapper modelMapper;



        @Override
        public User addUser(UserDto userDto) {
            User user = new User();
            user.setName(userDto.getName());
            user.setEmail(userDto.getEmail());
            user.setPassword(userDto.getPassword());
            User savedUser = userRepository.save(user);
            return savedUser;
        }

        @Override
        public void delete(Integer id) {
            userRepository.delete(userRepository.getOne(id));
        }

        @Override
        public User getByName(String name) {
            return userRepository.findByName(name);
        }


        @Override
        public User getById(Integer id) {
            User user = userRepository.getOne(id);
            return user;
        }


        @Override
        public User editUser(UserDto userDto) {
            User user = convertToEntity(userDto);
            user.setName(userDto.getName());
            user.setEmail(userDto.getEmail());
            user.setPassword(userDto.getPassword());
            return userRepository.saveAndFlush(user);
        }


        @Override
        public List<User> getAll() {
           return userRepository.findAll();
        }

        @Override
        public UserDto convertToDto(User user) {
            UserDto userDto = modelMapper.map(user, UserDto.class);
            return userDto;
        }


        @Override
        public User convertToEntity(UserDto userDto) {
            User user = modelMapper.map(userDto, User.class);
            return user;
        }


    }






