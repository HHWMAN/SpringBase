package com.zx.demo.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PlatMobileUserDetailsService implements UserDetailsService {

	@Autowired
	PlatMobileUserMapper platMobileUserMapper;
	
	@Override
	public UserDetails loadUserByUsername(String userid) {
		PlatMobileUserDetails platMobileUserDetails=new PlatMobileUserDetails();
		PlatMobileUser platMobileUser = platMobileUserMapper.selectByUserId(userid);
		if(null==platMobileUser){
			throw new UsernameNotFoundException(userid);
		}
		platMobileUserDetails.setPlatMobileUser(platMobileUser);
		return platMobileUserDetails;
	}

}
