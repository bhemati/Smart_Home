package com.example.sr11.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SR11")
public class notificationController {

    @PostMapping("/Email")
    public String notificationForm() {return "Email";}

    @PostMapping("/notiflist")
    public String notificationList() {return "notiflist";}

    @PostMapping("/sendEmail")
    public String notifHealthCheck () {return "sendEmail";}
}
