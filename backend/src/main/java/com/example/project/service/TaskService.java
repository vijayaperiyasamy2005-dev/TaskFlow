package com.example.project.service;

import com.example.project.model.Task;
import com.example.project.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
    public Task getTaskById(Long id){
        return taskRepository.findById(id)
                 .orElseThrow(()->new RuntimeException("Task not found"));

    }
    public void deleteTask(Long id){
        taskRepository.findById(id).orElseThrow(()->new RuntimeException("Task not found"));
          taskRepository.deleteById(id);
    }
    public Task update(Long id,Task task){
      taskRepository.findById(id)
              .orElseThrow(()->new RuntimeException("task not found"));
      task.setId(id);
      return taskRepository.save(task);
    }
}


