package com.example.userservice.security;

import com.example.userservice.DTO.UserDto;
import com.example.userservice.VO.RequestLogin;
import com.example.userservice.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private UserService userService;
    private Environment env;
    public AuthenticationFilter(AuthenticationManager authenticationManager,
                                UserService userService, Environment env) {
        super.setAuthenticationManager(authenticationManager);
        this.userService=userService;
        this.env=env;
    }
    //login을 했을때 인증 작업 처리를 위해서

    
    @Override //인증을 처음 시도할 때 호출
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {
        try {
            //AuthenticationManager에게 전달하기 위해 토큰을 만든것
            RequestLogin creds = new ObjectMapper().readValue(request.getInputStream(),RequestLogin.class);
            System.out.println("호출.....");
            return getAuthenticationManager().authenticate(
                    new UsernamePasswordAuthenticationToken(
                            creds.getEmail(),
                            creds.getPassword(),
                            new ArrayList<>()
                    )
            );
            //
        }catch (IOException e){
            throw new RuntimeException(e);
        }


    }

    @Override //로그인 성공 후 호출
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {
        System.out.println("username : "+((User)authResult.getPrincipal()).getUsername());
        String userName =((User)authResult.getPrincipal()).getUsername();
        UserDto userDto= userService.getUserDetailByEmail(userName);

        String token = Jwts.builder()
                .setSubject(userDto.getUserId())
                .setExpiration(new Date(System.currentTimeMillis()+
                        Long.parseLong(env.getProperty("token.expiration_time"))))
                .signWith(SignatureAlgorithm.HS512,env.getProperty("token.secret"))
                .compact();

        response.addHeader("token",token);
        response.addHeader("userId",userDto.getUserId());
    }
}
