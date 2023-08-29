package com.example.restservice.user;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@NoArgsConstructor
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService service;

//    @GetMapping("/users")
//    public MappingJacksonValue allUser(){
//
//        List<User> users = service.findAll();
//
//        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
//                .filterOutAllExcept("id","name","joinDate","password");
//        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("UserInfo",filter);
//
//        MappingJacksonValue mapping = new MappingJacksonValue(users);
//        mapping.setFilters(filterProvider);
//        return mapping;
//
//    }
//
//    @GetMapping("/users/{id}")
//    public MappingJacksonValue oneUser(@PathVariable int id){
//        User user = service.findOne(id);
//        if(user == null){
//            throw new UserNotFoundException(String.format("ID[%s] Not Found",id));
//        }
//        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
//                .filterOutAllExcept("id","name","joinDate","ssn");
//        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("UserInfo",filter);
//
//        MappingJacksonValue mapping = new MappingJacksonValue(user);
//        mapping.setFilters(filterProvider);
//        return mapping;
//    }
//
//    @PostMapping("/users")
//    public ResponseEntity create(@Valid @RequestBody User user){
//        User savedUser = service.save(user);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(savedUser.getId())
//                .toUri(); //만든 유저 객체 정보를 보여주기 위해서 uri를 만들어 줌
//
//        return ResponseEntity.created(location).build();
//    }
//
//    @DeleteMapping("/users/{id}")
//    public void deleteUser(@PathVariable int id){
//        User user = service.deleteById(id);
//        if(user==null){
//            throw new UserNotFoundException(String.format("ID[%s] Not Found",id));
//        }
//    }
}
