package com.kapple.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kapple.domain.CustomUser;
import com.kapple.domain.EmpVO;
import com.kapple.mapper.MapperKW;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private MapperKW mapper;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("Load User By UserName : "+username);
		EmpVO vo = mapper.read(username);
		log.warn("queried by emp mapper: "+vo);
		return vo == null?null : new CustomUser(vo);
	}

}
