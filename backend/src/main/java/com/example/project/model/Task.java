package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String status;
    private LocalDate dueDate;
   public Task(){}

    public Task(Long id,String title,String description,String status,LocalDate dueDate ){
       this.id=id;
       this.title=title;
       this.description=description;
       this.status=status;
       this.dueDate=dueDate;
    }
    //setter or getter

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
