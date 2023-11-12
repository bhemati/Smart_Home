package com.example.sr11.repository;

import com.example.sr11.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface notificationRepository extends JpaRepository<Notification,Integer>{
    List<Notification> findAll();
    Notification findByEmail(String email);

    Notification findById(int id);
    Notification saveNotification(Notification notification);
}
