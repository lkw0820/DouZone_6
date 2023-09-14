package com.kosa.douzondocker.service;

import com.kosa.douzondocker.VO.MemberVO;
import com.kosa.douzondocker.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper mapper;

    public List<MemberVO> selectAllMembers(){
        return mapper.selectedAllMembers();
    }
}
