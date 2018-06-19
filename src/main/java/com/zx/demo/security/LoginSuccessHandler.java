package com.zx.demo.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;


public class LoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		   Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
	        if (roles.contains("ROLE_ADMIN")) {
	            response.sendRedirect("test");
	        }/*else if(roles.contains("ADMIN")){
	        	response.sendRedirect("demo");
	        }*/else{
				response.sendRedirect("demo");
				/*System.out.println("权限异常");
				throw new BadCredentialsException("权限异常");*/
			}

		AppUserDetails user = (AppUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println(user.getUsername());


	}

}
