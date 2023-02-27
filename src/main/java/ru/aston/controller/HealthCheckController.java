package ru.aston.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    @GetMapping("/health")
    public String isAlive() {
        return "I'm dead inside but actually alive";
    }
}
