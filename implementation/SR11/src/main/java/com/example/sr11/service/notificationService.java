package com.example.sr11.service;

import com.example.sr11.model.Notification;
import com.example.sr11.repository.notificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class notificationService {

    @Autowired
    private notificationRepository notification_Repository;

    public Notification save(Notification notification) {return notification_Repository.saveNotification(notification);}

    public List<Notification> findall()
    {
        return this.notification_Repository.findAll();
    }

    public Notification findByEmail(String email)
    {
        return this.notification_Repository.findByEmail(email);
    }

    public Notification findById(int id)
    {
        return this.notification_Repository.findById(id);
    }
}
