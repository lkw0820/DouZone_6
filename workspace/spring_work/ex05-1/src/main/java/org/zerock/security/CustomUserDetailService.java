package org.zerock.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.zerock.domain.CustomUser;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

import lombok.extern.log4j.Log4j;
@Log4j
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private MemberMapper mapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//username=id
		log.warn("UserName: "+username);
		MemberVO vo = mapper.read(username);
		
		log.warn(vo);
		return vo == null ? null : new CustomUser(vo);
	}

}
