package com.zx.demo.security;


import com.zx.demo.domain.mybatis.Authority;
import org.springframework.security.core.GrantedAuthority;


public class AppOperationAuthority implements GrantedAuthority {

	private Authority authority;

	public AppOperationAuthority(Authority authority) {
		this.authority=authority;
	}

	@Override
	public String getAuthority() {
		return authority.getAuthority_name();
	}

	@Override
	public String toString() {
		return authority.toString();
	}
}
