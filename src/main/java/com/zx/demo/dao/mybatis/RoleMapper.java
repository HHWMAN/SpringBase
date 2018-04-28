package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String role_id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String role_id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}