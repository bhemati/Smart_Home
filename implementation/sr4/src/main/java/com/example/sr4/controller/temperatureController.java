package src.main.java.com.example.sr4.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sr4")
public class temperatureController {

    @PostMapping("/userPref")
    public String userPref() {return "userPref";}

    @PostMapping("/temperature")
    public String temperatureForm() { return "temperature";}

    @PostMapping("/adjustTemperature")
    public String adjustTemperature() {return "adjustTemperature";}

    @PostMapping("/sendResultHealthCheck")
    public String controlHealthCheck() {return "adjustDimness";}
}
