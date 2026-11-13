package com.example.project.controller;

import com.example.project.model.User;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")

@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.login(user.getEmail(), user.getPassword());
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
    return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUSerById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "deleted " +id;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id,@RequestBody User user){
      return  userService.update(id,user);
    }
}


