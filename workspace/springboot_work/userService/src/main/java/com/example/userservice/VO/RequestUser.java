package com.example.userservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
//사용자한태 정보를 받은 user, form에서 데이터 값을 받기 위한 용도
public class RequestUser {
    @NotNull(message = "Email can not be null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "Name can not be null")
    @Size(min = 2, message = "Name not be less than two characters")
    private String name;

    private String password;
}
