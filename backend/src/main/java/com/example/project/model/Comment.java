package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private String author;
    private LocalDateTime createdAt;

    public Comment(){}
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

    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor(){
        return this.author;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

}
