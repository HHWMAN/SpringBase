package com.zx.demo.security;


import com.zx.demo.domain.mybatis.User;
import org.springframework.security.core.GrantedAuthority;


public class AppUserRole implements GrantedAuthority {
	
	private User platMobileUser;

	public AppUserRole(User platMobileUser) {
		this.platMobileUser=platMobileUser;
	}

	@Override
	public String getAuthority() {
		return platMobileUser.getId();
	}

}
