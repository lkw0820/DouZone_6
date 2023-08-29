package com.example.restservice.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!!";
    }

    @GetMapping("hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("hello kiwon");
    }

    @GetMapping("hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean2(@PathVariable String name){
        return new HelloWorldBean(String.format("HELLO WORLD BEAN, %s",name));
    }

    @GetMapping("/hello-world-international")
    public String helloWorldInternational(@RequestHeader(name="Accept-Language", required = false) Locale locale){
        return messageSource.getMessage("greeting.message",null,locale);
    }
}
