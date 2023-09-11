package com.kosa.securitystudy.service;

import com.kosa.securitystudy.data.dto.SignInResultDto;
import com.kosa.securitystudy.data.dto.SignUpResultDto;

public interface SignService {
    SignUpResultDto signUp(String id, String password, String name, String role);

    SignInResultDto signIn(String id, String password)throws RuntimeException;

}
