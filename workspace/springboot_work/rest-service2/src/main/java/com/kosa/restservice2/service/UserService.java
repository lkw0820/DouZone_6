package com.kosa.restservice2.service;

import com.kosa.restservice2.obj.Post;
import com.kosa.restservice2.obj.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findUser(int id);
    public User save(User user);
    public void savePost(Post post);
}
