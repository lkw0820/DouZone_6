package com.example.userservice.service;

import com.example.userservice.DTO.UserDto;
import com.example.userservice.jpa.UserEntity;
import com.example.userservice.jpa.UserRepository;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override //실질적 로그인 판단
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByEmail(username);

        if(userEntity==null){
            throw new UsernameNotFoundException(username+" : not found");
        }
        return new User(userEntity.getEmail(),userEntity.getEncryptedPwd(),
                true,true,true,true,new ArrayList<>());

    }

    @Override
    public UserDto createUser(UserDto userDto) {
        //DTO에 userId 세팅
        userDto.setUserId(UUID.randomUUID().toString());
        //DTO->Entity
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = mapper.map(userDto,UserEntity.class);
        //Entity에 비밀번호 암호화
        userEntity.setEncryptedPwd(passwordEncoder.encode(userDto.getPassword()));

        userRepository.save(userEntity);

        //Entity->DTO
        UserDto returnUserDto = mapper.map(userEntity,UserDto.class);

        return returnUserDto;
    }

    @Override
    public UserDto getUserByUser(String userId) {
        return null;
    }

    @Override
    public Iterable<UserEntity> getUserByAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDto getUserDetailByEmail(String userName) {
        UserEntity userEntity = userRepository.findByEmail(userName);
        if(userEntity == null){
            throw new UsernameNotFoundException(userName+ " : not found");
        }
        ModelMapper mapper =new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = mapper.map(userEntity,UserDto.class);
        return userDto;
    }


}
