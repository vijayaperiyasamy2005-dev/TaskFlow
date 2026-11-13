package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    private String description;
   public Category(){}

    //getter and setter
    public void setId(Long id){
       this.id=id;
    }
    public Long getId(){
       return this.id;
    }
    public void setCategoryName(String categoryName){
       this.categoryName=categoryName;
    }
    public String getCategoryName(){
       return this.categoryName;
    }
    public void setDescription(String description){
       this.description=description;
    }
    public String getDescription(){
       return this.description;
    }

}
