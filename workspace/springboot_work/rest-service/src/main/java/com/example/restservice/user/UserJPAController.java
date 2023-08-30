package com.example.restservice.user;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/jpa")
public class UserJPAController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/users")
    public List<User> allUser(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}/posts")
    public List<Post> allPostsByUser(@PathVariable int id){
        Optional<User> user= userRepository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException(String.format("ID[%s] Not Found",id));
        }
        return user.get().getPosts(); //get() Optional객체에서 get을 해야 user 객체가 된다
    }
    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Post> createPosts(@PathVariable int id, @RequestBody Post post){
        Optional<User> user= userRepository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException(String.format("ID[%s] Not Found",id));
        }
        post.setUser(user.get()); //id가 없음
        Post savePost=postRepository.save(post); //savePost는 DB에 저장된 id값도 가져옴
        //201 Ok만들어주는것
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savePost.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }


    @GetMapping("/users/{id}")
    public EntityModel<Optional<User>> oneUser(@PathVariable int id){
        //optional 사용 이유 : null 방지용
        Optional<User> user = userRepository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException(String.format("ID[%s] Not Found",id));
        }
        return EntityModel.of(user, linkTo(methodOn(UserJPAController.class).allUser()).withRel("all-users"));
    }

    @PostMapping("/users")
    public ResponseEntity<User> create(@Valid @RequestBody User user){
        User savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri(); //만든 유저 객체 정보를 보여주기 위해서 uri를 만들어 줌

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }
}
