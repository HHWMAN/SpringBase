package com.zx.demo.security;

import com.zx.demo.dao.UserDao;
import com.zx.demo.dao.impl.UserDaoImpl;

import com.zx.demo.dao.mybatis.AuthorityMapper;
import com.zx.demo.dao.mybatis.RoleAuthorityMapper;
import com.zx.demo.dao.mybatis.UserRoleMapper;
import com.zx.demo.domain.mybatis.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Component
public class AppUserDetails implements UserDetails {

	@Autowired
	UserDao userDaoImpl;

	@Autowired
	private UserRoleMapper userRoleMapper;

	@Autowired
	RoleAuthorityMapper roleAuthorityMapper;

	@Autowired
	AuthorityMapper authorityMapper;
	

	private User appUser;   //对应数据库中的用户
	//private Collection<GrantedAuthority>  appUserAuthorities; //应用用户权限


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<AppUserAuthority> authorityList = new ArrayList<AppUserAuthority>();

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

	/*public Collection<GrantedAuthority> getAppUserAuthorities() {
		return appUserAuthorities;
	}*/


	public UserDao getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

	public UserRoleMapper getUserRoleMapper() {
		return userRoleMapper;
	}

	public void setUserRoleMapper(UserRoleMapper userRoleMapper) {
		this.userRoleMapper = userRoleMapper;
	}

	public RoleAuthorityMapper getRoleAuthorityMapper() {
		return roleAuthorityMapper;
	}

	public void setRoleAuthorityMapper(RoleAuthorityMapper roleAuthorityMapper) {
		this.roleAuthorityMapper = roleAuthorityMapper;
	}

	public AuthorityMapper getAuthorityMapper() {
		return authorityMapper;
	}

	public void setAuthorityMapper(AuthorityMapper authorityMapper) {
		this.authorityMapper = authorityMapper;
	}
}
