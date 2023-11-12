package com.shcs.sr3_5.model;

import com.example.sr3_5.repository.maintainigRepository;
import com.example.sr3_5.services.maintainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sr35")
public class monitoringController {
    @Autowired
    private monitoringService monitoring_service;


    @PostMapping("/getRoom")
    public String getRoom() {
        return "getRoom";
    }

    @PostMapping("/getSensorType")
    public String getSensorType() {
        return "getSensorType";
    }
}
