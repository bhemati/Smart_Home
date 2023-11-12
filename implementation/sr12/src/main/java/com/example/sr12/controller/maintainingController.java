package com.example.sr12.controller;

import com.example.sr12.repository.maintainigRepository;
import com.example.sr12.services.maintainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sr12")
public class maintainingController {
    @Autowired
    private maintainingService maintainig_service;


    @PostMapping("/sendHealthCechk")
    public String sendHealthCechk() {
        return "sendHealthCechk";
    }
}
