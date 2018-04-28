package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.RoleAuthority;

public interface RoleAuthorityMapper {
    int deleteByPrimaryKey(String role_authority_id);

    int insert(RoleAuthority record);

    int insertSelective(RoleAuthority record);

    RoleAuthority selectByPrimaryKey(String role_authority_id);

    int updateByPrimaryKeySelective(RoleAuthority record);

    int updateByPrimaryKey(RoleAuthority record);
}