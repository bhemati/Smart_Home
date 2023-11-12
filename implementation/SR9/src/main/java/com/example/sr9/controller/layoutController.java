package com.example.sr9.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SR9")
public class layoutController {
    @PostMapping("/layoutpage")
    public String layoutPage() {
        return "layout page";
    }
}
