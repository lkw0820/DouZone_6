package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"aaa","서울"));
        users.add(new User(2,"bbb","인천"));
        users.add(new User(3,"ccc","부산"));
    }

    public List<User> findAll(){
        return users;
    }
}
