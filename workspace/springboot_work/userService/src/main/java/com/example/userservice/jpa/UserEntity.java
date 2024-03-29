package com.example.userservice.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="user2")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, unique = true)
    private String encryptedPwd;
}
