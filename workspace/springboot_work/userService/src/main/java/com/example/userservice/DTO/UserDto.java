package com.example.userservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String email;
    private String name;
    private String password;
    private String userId;
    //private Date createdAt;
    private String encryptedPwd;//암호화된 비밀번호

}
