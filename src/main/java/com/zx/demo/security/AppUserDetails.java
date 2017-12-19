package com.zx.demo.security;


import com.zx.demo.domain.mybatis.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;



public class AppUserDetails implements UserDetails {

	private User appUser;   //对应数据库中的用户

	private Collection<GrantedAuthority>  appUserAuthorities; //应用用户权限

	public void setAppUserAuthorities(Collection<GrantedAuthority> appUserAuthorities) {
		this.appUserAuthorities = appUserAuthorities;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return appUserAuthorities;
	}

	@Override
	public String getPassword() {
		return appUser.getPassword();
	}

	@Override
	public String getUsername() {
		return appUser.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return "N".equals(appUser.getIsExpired())?true:false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return "N".equals(appUser.getIsLocked())?true:false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return "N".equals(appUser.getIsCredentialsExpired())?true:false;
	}

	@Override
	public boolean isEnabled() {
		return "Y".equals(appUser.getIsEnabled())?true:false;
	}


	public User getAppUser() {
		return appUser;
	}

	public void setAppUser(User appUser) {
		this.appUser = appUser;
	}


}
