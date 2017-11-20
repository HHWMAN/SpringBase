package com.zx.demo.security;

import com.zx.demo.domain.mybatis.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;


@Component
public class PlatMobileUserDetails  implements UserDetails {
	

	private User platMobileUser;
	public User getPlatMobileUser() {
		return platMobileUser;
	}

	public void setPlatMobileUser(User platMobileUser) {
		this.platMobileUser = platMobileUser;
	}

	@Override
	public Collection<PlatMobileUserRole> getAuthorities() {
		ArrayList<PlatMobileUserRole> Roles = new ArrayList<>();
		Roles.add(new PlatMobileUserRole(platMobileUser));
		return Roles;

	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return platMobileUser.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return platMobileUser.getUserid();
	}

	@Override
	public boolean isAccountNonExpired() {
		return platMobileUser.getAccountexpiredate().getTime()>Calendar.getInstance().getTimeInMillis()?true:false;
     //return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return platMobileUser.getIslocked().equals("N")?true:false;
		//return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}



	public String getLoginname() {
		return platMobileUser.getLoginname();
	}

	public String getUserid() {
		return platMobileUser.getUserid();
	}

	public String getUsertype() {
		return  platMobileUser.getUsertype();
	}

}
