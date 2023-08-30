package com.example.restservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

//@Entity
//@Table(name="user2")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"password","ssn"})
//@JsonFilter("UserInfo")
public class User {

//    @Id
//    @GeneratedValue
    private Integer id;

    @Size(min =2,message = "name은 2글자 이상")
    private String name;

    @Past
    private Date joinDate;

    //@JsonIgnore
    private String password;
    //@JsonIgnore
    private String ssn;

    //@OneToMany(mappedBy = "user") //post에서 사용한 이름으로 매핑
    //private List<Post> posts;


    public User(int id,String name,Date joinDate,String password,String ssn){
        this.id=id;
        this.name=name;
        this.joinDate=joinDate;
        this.password=password;
        this.ssn=ssn;
    }
}
