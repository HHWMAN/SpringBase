package com.zx.demo.security;


import com.zx.demo.domain.mybatis.User;
import org.springframework.security.core.GrantedAuthority;


public class PlatMobileUserRole implements GrantedAuthority {
	
	private User platMobileUser;

	public PlatMobileUserRole(User platMobileUser) {
		this.platMobileUser=platMobileUser;
	}

	@Override
	public String getAuthority() {
		return platMobileUser
	}

}
