package com.zx.demo.security;


import com.zx.demo.domain.mybatis.*;
import org.springframework.security.core.GrantedAuthority;



public class AppUserAuthority implements GrantedAuthority {
	
	private Authority authority;

	public AppUserAuthority(Authority authority) {
		this.authority=authority;
	}

	@Override
	public String getAuthority() {
		   return authority.getAuthority_sign();
	}

	@Override
	public String toString() {
		return authority.toString();
	}
}
