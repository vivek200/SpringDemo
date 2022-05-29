package com.spring.example.demo.controllers;

import com.spring.example.demo.Coach;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    public Coach coach;

    public CoachController(Coach c) {
        this.coach = c;
    }
}
