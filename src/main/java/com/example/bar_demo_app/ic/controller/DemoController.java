package com.example.bar_demo_app.ic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
    
}
