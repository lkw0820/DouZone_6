package com.example.restservice.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//user: post -> 1(main, parent):n(sub, child)
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    
//    @Id
//    @GeneratedValue
    private Integer id;
    
    private String description;
    
    //관계를 맺는 용도로만 사용
//    @JsonIgnore
//    @ManyToOne(fetch = FetchType.LAZY)//post에서 필요로 할때 user객체의 정보를 가져온다
    private int user_id;
}
