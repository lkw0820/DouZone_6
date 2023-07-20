package org.zerock.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication auth) throws IOException, ServletException {
		List<String> roleName = new ArrayList<String>();
		auth.getAuthorities().forEach(authority -> {
			roleName.add(authority.getAuthority());
		});
		
		if(roleName.contains("ROLE_ADMIN")) {
			response.sendRedirect("/board/list");
			return;
		}
		if(roleName.contains("ROLE_MEMBER")) {
			response.sendRedirect("/board/list");
			return;
		}
		response.sendRedirect("/");
		
	}

}
