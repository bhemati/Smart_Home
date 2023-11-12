package com.example.sr11.model;

public class Notification {
    int id;
    String Email;
    roles role;
    notificationID notification_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public roles getRole() {
        return role;
    }

    public void setRole(roles role) {
        this.role = role;
    }

    public notificationID getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(notificationID notification_id) {
        this.notification_id = notification_id;
    }
}
