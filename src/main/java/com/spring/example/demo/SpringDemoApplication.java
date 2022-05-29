package com.spring.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication implements Coach {
    public String dailyWorkOut()
    {
	 return "Running is good";
    }

    @Override
    public String dietPlan() {
        return "eat proper food";
    }


}
