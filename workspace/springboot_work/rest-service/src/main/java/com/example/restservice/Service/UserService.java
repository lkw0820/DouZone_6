package com.example.restservice.Service;

import com.example.restservice.mapper.UserMapper;
import com.example.restservice.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public List<User> findAll(){
        return mapper.findAllUsers();
    }
}
