package com.example.project.controller;

import com.example.project.model.Notification;
import com.example.project.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
@CrossOrigin(origins= "http://localhost:5173")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public Notification saveNotification(@RequestBody Notification notification){
    return notificationService.saveNotification(notification);
    }
    @GetMapping
    public List<Notification> getAllNotification(){
        return notificationService.getAllNotification();
    }
    @GetMapping("/{id}")
    public Notification getNotificationById(@PathVariable Long id){
        return notificationService.getNotificationById(id);
    }
    @PutMapping("/{id}")
    public Notification update(@PathVariable Long id,@RequestBody Notification notification){
        return notificationService.update(id,notification);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        notificationService.delete(id);
        return "deleted this record" +id;
    }

}
