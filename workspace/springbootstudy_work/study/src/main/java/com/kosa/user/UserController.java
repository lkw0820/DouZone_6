package com.kosa.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> allUser(){
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User oneUser(@PathVariable int id) {
		return service.findOne(id);
	}

}
