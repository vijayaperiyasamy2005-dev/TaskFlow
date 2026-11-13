package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private LocalDateTime createAt;

    public Notification(){}

    public void setId(Long id){
       this.id=id;
    }
    public Long getId(){
        return this.id;
    }

    public void setMessage(String message){
        this.message=message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setCreateAt(LocalDateTime createAt){
        this.createAt=createAt;
    }
    public LocalDateTime getCreateAt(){
        return this.createAt;
    }

}


