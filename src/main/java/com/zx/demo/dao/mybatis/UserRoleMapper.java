package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(String user_role_id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(String user_role_id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}