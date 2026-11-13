package com.example.project.service;

import com.example.project.model.User;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User login(String email, int password) {
        return userRepository.findByEmailAndPassword(email, password)
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public User getUSerById(Long id){
        return userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("user not found!"));
    }
    public void deleteUser(Long id){
        userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found!"));
         userRepository.deleteById(id);
    }
    public User update(Long id,User user){
         userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
       user.setId(id);
       return userRepository.save(user);
    }
}
