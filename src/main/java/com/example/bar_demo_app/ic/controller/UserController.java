package com.example.bar_demo_app.ic.controller;

import org.seasar.doma.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bar_demo_app.dac.bc.DemoService;
import com.example.bar_demo_app.dac.entity.UserInformation;
import com.example.bar_demo_app.ic.dto.InDto;

@RestController
public class UserController {

    @Autowired
    private DemoService service;

    @Select
    @PostMapping("/api/getUser")
    @CrossOrigin(origins = "*")
    public String selectUser(@RequestBody InDto dto){

        System.out.println("get reqest");
        return service.getUser(dto);

    }

    @Select
    @PostMapping("/api/insertUser")
    @CrossOrigin(origins = "*")
    public int insertUser(@RequestBody UserInformation dto){
        
        service.insertUser(dto);

        return 0;
    }
    
}
