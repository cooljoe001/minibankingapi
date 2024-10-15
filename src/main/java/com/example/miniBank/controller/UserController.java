package com.example.miniBank.controller;


import com.example.miniBank.model.User;
import com.example.miniBank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
// CREATING A USER
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

// GETTING ONLY A USER BY IT ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

  // GETTING ALL USERS
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    // DELETING A USER
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }



}
