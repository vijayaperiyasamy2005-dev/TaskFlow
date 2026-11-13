package com.example.project.controller;

import com.example.project.model.Comment;
import com.example.project.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")

@CrossOrigin(origins= "http://localhost:5173")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }
    @GetMapping
    public List<Comment> getAllComment(){
        return commentService.getAllComment();
    }
    @GetMapping("{id}")
    public Comment getCommentById(@PathVariable Long id){
        return commentService.getCommentById(id);
    }


    @PutMapping("/{id}")
    public Comment update(@PathVariable Long id,@RequestBody Comment comment){
        return commentService.update(id,comment);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
         commentService.delete(id);
        return "deleted " +id;
    }
    
}
