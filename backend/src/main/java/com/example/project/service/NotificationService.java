package com.example.project.service;


import com.example.project.model.Notification;
import com.example.project.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification){
        return notificationRepository.save(notification);
    }

    public List<Notification> getAllNotification(){
        return notificationRepository.findAll();
    }
    public Notification getNotificationById(Long id){
        return notificationRepository.findById(id).orElseThrow(()->new RuntimeException("notification not found!"));
    }
    public Notification update(Long id,Notification notification){
        notificationRepository.findById(id).orElseThrow(()->new RuntimeException("notification not found"));
        notification.setId(id);
        return notificationRepository.save(notification);
    }
    public String delete(Long id){
        notificationRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
        notificationRepository.deleteById(id);
        return "deleted the this record!" +id;
    }
}
