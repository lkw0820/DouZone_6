package com.kosa.restservice2.obj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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

    private Integer id;
    private String name;
    private Date joinDate;
    private String password;
    private String ssn;
    private List<Post> posts;

    public User(int id, String name, Date joinDate, String password, String ssn){
        this.id=id;
        this.name=name;
        this.joinDate=joinDate;
        this.password=password;
        this.ssn=ssn;
    }
}
