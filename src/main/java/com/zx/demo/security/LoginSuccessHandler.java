package com.zx.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;


@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		   Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
	        if (roles.contains("user")) {
	            response.sendRedirect("index");
	        }else if(roles.contains("admin")){
	        	response.sendRedirect("index");
	        }

/*		PlatMobileUserDetails user = (PlatMobileUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println(user.getUsername());*/


	}

}
