package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<User> userList(){
        System.out.println("요청........");
        return service.findAll();
    }
}
