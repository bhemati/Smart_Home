package com.example.sr8.controller;


import com.example.sr8.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sr8")
public class userController {
    @Autowired
    private userRepository user_Repository;


    @PostMapping("/login")
    public String userForm() {
        return "login";
    }

    @PostMapping("/registration")
    public String newUser() {
        return "registration";
    }

    @PostMapping("/logout")
    public String userLogout() {
        return "userLogout";
    }


    @PostMapping("/sendResultHealthCheck")
    public String userHealthCheck() {
        return "userLogout";
    }
}
