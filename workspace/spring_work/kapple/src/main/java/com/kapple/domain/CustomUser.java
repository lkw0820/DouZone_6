package com.kapple.domain;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Data;

@Data
public class CustomUser extends User {
	private static final long serialVersionUID = 1L;
	private EmpVO emp;
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
	}
	public CustomUser(EmpVO vo) {	
		super(vo.getId(),vo.getPw(), vo.getAuthList().stream()
				.map(auth-> new SimpleGrantedAuthority(auth.getAuth_grade())).collect(Collectors.toList()));
		this.emp=vo;
	}

}
