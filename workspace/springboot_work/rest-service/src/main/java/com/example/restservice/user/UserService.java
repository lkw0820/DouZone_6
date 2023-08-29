package com.example.restservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();
    private static int userCount=3;

    static {
        users.add(new User(1,"kosa",new Date(),"asd","1234-1234"));
        users.add(new User(2,"douzon",new Date(),"qwe","5678-5678"));
        users.add(new User(3,"naver",new Date(),"zxc","9123-9123"));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(int id){
        for(User user : users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId((++userCount));
        }
        users.add(user);
        return user;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator(); //
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
