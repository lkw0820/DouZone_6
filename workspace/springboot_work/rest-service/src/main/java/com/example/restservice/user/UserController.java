package com.example.restservice.user;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

//@RestController
@NoArgsConstructor
public class UserController {
//
//    @Autowired
//    private UserService service;
//
//    @GetMapping("/users")
//    public List<User> allUser(){
////        for(User user : users){
////            return user;
////        }
////        return null;
//        return service.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    public EntityModel<User> oneUser(@PathVariable int id){
//        User user = service.findOne(id);
//        if(user == null){
//            throw new UserNotFoundException(String.format("ID[%s] Not Found",id));
//        }
//        return EntityModel.of(user, linkTo(methodOn(UserController.class).allUser()).withRel("all-users"));
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
