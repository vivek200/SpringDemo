package com.spring.example.demo;

import org.springframework.stereotype.Service;
public class TrackCoach implements Coach {
    public String dailyWorkOut(){
        return "run 5km per day with full speed";
    }

    @Override
    public String dietPlan() {
        return "Eat health food";
    }
}
