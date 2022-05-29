package com.spring.example.demo;

import org.springframework.stereotype.Component;

@Component
public interface Coach {
    public String dailyWorkOut();
    public String dietPlan();
}