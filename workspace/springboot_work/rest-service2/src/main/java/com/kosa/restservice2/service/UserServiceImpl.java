package com.kosa.restservice2.service;

import com.kosa.restservice2.mapper.UserMapper;
import com.kosa.restservice2.obj.Post;
import com.kosa.restservice2.obj.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> findAll() {
        return mapper.findAllUsers();
    }

    @Override
    public User findUser(int id) {
        return mapper.findUser(id);
    }

    @Override
    public User save(User user) {
        mapper.createUser(user);
        return user;
    }

    @Override
    public void savePost(Post post) {
        mapper.createPost(post);
    }
}
