package com.example.sr6.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sr6")
public class lightDimnessController {

    @PostMapping("/userPref")
    public String userPref() {return "userPref";}

    @PostMapping("/dimness")
    public String dimnessForm() { return "dimness";}

    @PostMapping("/adjustDimness")
    public String adjustDimness() {return "adjustDimness";}

    @PostMapping("/sendResultHealthCheck")
    public String controlHealthCheck() {return "sdjustDimness";}
}
