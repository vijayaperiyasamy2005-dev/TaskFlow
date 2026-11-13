package com.example.project.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;


@JsonPropertyOrder({
        "id",
        "name",
        "email",
        "password",
        "role"
})


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int password;
    private String role;


   
    public User(){}
//    public void user(Long id,String name,String email,int password,String role){
//        this.id=id;
//        this.name=name;
//        this.email=email;
//        this.password=password;
//        this.role=role;
//    }
  //getter or setter
    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPassword(int password){
        this.password=password;
    }
    public int getPassword(){
        return this.password;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return this.role;
    }
}
