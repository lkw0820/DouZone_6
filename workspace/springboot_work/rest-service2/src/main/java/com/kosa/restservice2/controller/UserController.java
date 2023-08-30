package com.kosa.restservice2.controller;

import com.kosa.restservice2.obj.Post;
import com.kosa.restservice2.obj.User;
import com.kosa.restservice2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<User> getAllUsers() {return service.findAll();}

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return service.findUser(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        service.save(user);
    }

    @PostMapping("/users/{id}/posts")
    public void createPost(@PathVariable int id, @RequestBody Post post){
        post.setUser_id(id);
        service.savePost(post);
    }
}
