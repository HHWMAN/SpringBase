package com.zx.demo.security;


import com.zx.demo.dao.mybatis.*;
import com.zx.demo.domain.mybatis.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

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
	RoleMapper roleMapper;

	@Autowired
	AuthorityMapper authorityMapper;


	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        List<User> userList = userMapper.selectByUserName(userName);
        if(userList.size()<1){
			throw new UsernameNotFoundException("无此用户");
		}else if(userList.size()>1){
			throw new BadCredentialsException("对应多个用户");
		}

		User user = userList.get(0);
		AppUserDetails appUserDetails = new AppUserDetails();
		appUserDetails.setAppUser(user);
		appUserDetails.setAppUserAuthorities(getAuthorities(user));
		return appUserDetails;
	}

	public Collection<GrantedAuthority> getAuthorities(User appUser){
		Collection<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();

		//通过用户id查user、role对应
		String userId = appUser.getUser_id();

		List<UserRole> userRoleList = userRoleMapper.selectByUserId(appUser.getUser_id());

		//处理得到的对应关系，获得role
		for(UserRole userRole:userRoleList){
			String roleId = userRole.getRole_id();

			//获得role
			Role role = roleMapper.selectByPrimaryKey(roleId);
			//加入AppRole
			authorityList.add(new AppRoleAuthority(role));

			//通过role,查询对应的权限id

			List<RoleAuthority> roleAuthorities =  roleAuthorityMapper.selectByRoleId(roleId);

			for(RoleAuthority roleAuthority:roleAuthorities){

				String authorityId = roleAuthority.getRauthority_id();
				Authority authority = authorityMapper.selectByPrimaryKey(authorityId);
				authorityList.add(new AppOperationAuthority(authority));
			}
		}
		return authorityList;
	}
}
