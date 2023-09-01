package com.example.userservice.service;

import com.example.userservice.DTO.UserDto;
import com.example.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUser(String userId);
    Iterable<UserEntity> getUserByAll();
}
