package com.zx.demo.security;


import com.zx.demo.dao.mybatis.AuthorityMapper;
import com.zx.demo.dao.mybatis.RoleAuthorityMapper;
import com.zx.demo.dao.mybatis.UserMapper;
import com.zx.demo.dao.mybatis.UserRoleMapper;
import com.zx.demo.domain.mybatis.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	private UserRoleMapper userRoleMapper;

	@Autowired
	RoleAuthorityMapper roleAuthorityMapper;

	@Autowired
	AuthorityMapper authorityMapper;


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
		AppUserDetails appUserDetails = new AppUserDetails();
		appUserDetails.setAppUser(user);
		appUserDetails.setAppUserAuthorities(getAuthort(user));
		return appUserDetails;
	}

	public Collection<GrantedAuthority> getAuthort(User appUser){
		Collection<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();

		//通过用户id查user、role对应
		String userId = appUser.getUser_id();
		UserRoleExample userRoleExample = new UserRoleExample();
		userRoleExample.createCriteria().andUser_idEqualTo(userId);
		List<UserRole> userRoleList = userRoleMapper.selectByExample(userRoleExample);

		//处理得到的对应关系，获得role
		List<Role> roleList = new ArrayList<Role>();
		for(UserRole userRole:userRoleList){
			String roleId = userRole.getRole_id();
			//通过role,查询对应的权限id
			RoleAuthorityExample roleAuthorityExample = new RoleAuthorityExample();
			roleAuthorityExample.createCriteria().andRole_idEqualTo(roleId);
			List<RoleAuthority> roleAuthorities =  roleAuthorityMapper.selectByExample(roleAuthorityExample);

			for(RoleAuthority roleAuthority:roleAuthorities){

				String authorityId = roleAuthority.getRauthority_id();
				Authority authority = authorityMapper.selectByPrimaryKey(authorityId);
				authorityList.add(new AppUserAuthority(authority));
			}
		}
		return authorityList;
	}
}
