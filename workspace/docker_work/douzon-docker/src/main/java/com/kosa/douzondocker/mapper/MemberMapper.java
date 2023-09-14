package com.kosa.douzondocker.mapper;

import com.kosa.douzondocker.VO.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> selectedAllMembers();
}
