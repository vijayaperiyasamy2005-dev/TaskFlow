package com.example.project.service;

import com.example.project.model.Category;
import com.example.project.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElseThrow(()->new RuntimeException("category not found"));
    }
    public Category update(Long id,Category category){
         categoryRepository.findById(id).orElseThrow(()->new RuntimeException("category not found"));
         category.setId(id);
         return categoryRepository.save(category);
    }
    public String deleteCategory(Long id){
        categoryRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
        categoryRepository.deleteById(id);
        return "deleted this record " +id;
    }

}
