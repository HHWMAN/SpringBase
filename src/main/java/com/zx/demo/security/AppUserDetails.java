package com.zx.demo.security;

import com.zx.demo.dao.mybatis.RoleMapper;
import com.zx.demo.dao.mybatis.UserMapper;
import com.zx.demo.domain.mybatis.User;
import com.zx.demo.domain.mybatis.UserRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;


@Component
public class AppUserDetails implements UserDetails {

	@Autowired
	UserMapper userMapper;

	@Autowired
	RoleMapper roleMapper;
	

	private User appUser;   //对应数据库中的用户
	private Collection<GrantedAuthority>  appUserAuthorities; //应用用户权限


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
        //通过用户名查role
        String userId = appUser.getUser_id();
		UserRoleExample userRoleExample = new UserRoleExample();
		userRoleExample.createCriteria().andUser_idEqualTo(userId);

		//查询所有role对应的权限


		return null;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}


	public User getAppUser() {
		return appUser;
	}

	public void setAppUser(User appUser) {
		this.appUser = appUser;
	}

	public Collection<GrantedAuthority> getAppUserAuthorities() {
		return appUserAuthorities;
	}

	public void setAppUserAuthorities(Collection<GrantedAuthority> appUserAuthorities) {
		this.appUserAuthorities = appUserAuthorities;
	}
}
