package com.example.demo.controller;
import com.example.demo.dao.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody UserDto userDto) {
        return userService.addUser(userDto);
    }

    @GetMapping(path = "/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userRepository.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.delete(id);
    }


    @PutMapping(path = "/{id}")
    public User editUpdate(@PathVariable("id") Integer id,@RequestBody UserDto userDto){
        userDto.setId(id);
        return userService.editUser(userDto);
    }




}