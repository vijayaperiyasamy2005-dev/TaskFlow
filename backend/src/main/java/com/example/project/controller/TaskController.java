package com.example.project.controller;


import com.example.project.model.Task;
import com.example.project.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/tasks")

@CrossOrigin(origins = "http://localhost:5173")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task saveTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }

    @GetMapping
    public List<Task>getAllTasks(){
        return taskService.getAllTasks();
    }
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }
    @PutMapping("/{id}")
    public Task update(@PathVariable Long id,@RequestBody Task task){
        return taskService.update(id,task);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
