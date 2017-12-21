package com.zx.demo.security;


import com.zx.demo.domain.mybatis.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;


public class AppRoleAuthority implements GrantedAuthority {
	
    private Role role;

	private final List<AppOperationAuthority> allowedOperations = new ArrayList<AppOperationAuthority>();

	public AppRoleAuthority(Role role) {
		this.role=role;
	}

	@Override
	public String getAuthority() {
		   return role.getRole_name();
	}

	public List<AppOperationAuthority> getAllowedOperations() {
		return allowedOperations;
	}

	@Override
	public String toString() {
		return role.toString();
	}
}
