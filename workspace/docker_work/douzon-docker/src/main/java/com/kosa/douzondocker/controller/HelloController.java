package com.kosa.douzondocker.controller;

import com.kosa.douzondocker.VO.MemberVO;
import com.kosa.douzondocker.mapper.MemberMapper;
import com.kosa.douzondocker.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private MemberService service;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Douzon 집가고싶다";
    }

    @GetMapping("/members")
    public List<MemberVO> findAllMembers(){
        return service.selectAllMembers();
    }

}
