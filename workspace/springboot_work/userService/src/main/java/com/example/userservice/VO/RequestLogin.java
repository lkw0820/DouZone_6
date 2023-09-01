package com.example.userservice.VO;

import lombok.Data;

@Data
public class RequestLogin {
    private String email;
    private String password;
}
