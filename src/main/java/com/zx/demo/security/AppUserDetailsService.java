package com.zx.demo.security;


import com.zx.demo.dao.mybatis.UserMapper;
import com.zx.demo.domain.mybatis.User;
import com.zx.demo.domain.mybatis.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	AppUserDetails appUserDetails;


	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andUsernameEqualTo(userName);
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList.size()<1){
			throw new UsernameNotFoundException("无此用户");
		}else if(userList.size()>1){
			throw new BadCredentialsException("对应多个用户");
		}

		User user = userList.get(0);
		appUserDetails.setAppUser(user);
       // userDetails.getAuthorities();
		return appUserDetails;
	}
}
