package com.example.userservice.security;

import com.example.userservice.service.UserService;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.Filter;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
    private UserService userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private Environment env;

    public WebSecurity(Environment env, UserService userService,BCryptPasswordEncoder bCryptPasswordEncoder){
        this.env=env;
        this.userService =userService;
        this.bCryptPasswordEncoder=bCryptPasswordEncoder;
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
//        http.authorizeHttpRequests().antMatchers("/user/**").permitAll();
//        http.authorizeHttpRequests().antMatchers("/h2-console/**").permitAll();
//        http.authorizeHttpRequests().antMatchers("/error/**").permitAll();

        http.authorizeRequests().antMatchers("/**")
                        .hasIpAddress("127.0.0.1")
                                .and()
                                        .addFilter(getAuthenticationFilter());


        http.headers().frameOptions().disable();
    }

    private Filter getAuthenticationFilter() throws Exception{

        AuthenticationFilter authenticationFilter = new AuthenticationFilter(authenticationManager(),userService,env);
        //authenticationFilter.setAuthenticationManager(authenticationManager());
        return authenticationFilter;
    }
}
