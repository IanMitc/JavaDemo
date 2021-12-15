package com.revature.user.service.controller;

import com.revature.user.service.dto.UserResponseDto;
import com.revature.user.service.entity.User;
import com.revature.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAllUser(){
        log.info("get all user");
        return service.getAllUser();
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        log.info("save user");
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public UserResponseDto getUserById(@PathVariable("id") Long id){
        return service.getUserWithDepartment(id);
    }
}
