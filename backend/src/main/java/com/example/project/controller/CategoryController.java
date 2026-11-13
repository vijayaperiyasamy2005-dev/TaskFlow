package com.example.project.controller;

import com.example.project.model.Category;
import com.example.project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorys")

@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

   @PostMapping
    public Category saveCategory(@RequestBody Category category){
       return categoryService.saveCategory(category);
   }
   @GetMapping
    public List<Category> getAllCategory(){
       return categoryService.getAllCategory();
   }
   @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id){
       return categoryService.getCategoryById(id);
   }
   @PutMapping("/{id}")
    public Category update(@PathVariable Long id,@RequestBody Category category){
       return categoryService.update(id,category);
   }
   @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable Long id){
       categoryService.deleteCategory(id);
       return "deleted" +id;
   }
}
