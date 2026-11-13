package com.example.project.service;

import com.example.project.model.Comment;
import com.example.project.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComment(){
        return commentRepository.findAll();
    }
    public Comment getCommentById(Long id){
        return commentRepository.findById(id).orElseThrow(()->new RuntimeException("comment not found"));
    }
    public Comment update(Long id,Comment comment){
        commentRepository.findById(id).orElseThrow(()->new RuntimeException("comment not found"));
        return commentRepository.save(comment);
    }
    public String delete(Long id){
        commentRepository.findById(id).orElseThrow(()->new RuntimeException("cmt not found"));
        commentRepository.deleteById(id);
        return "deleted this record " +id;
    }

}


