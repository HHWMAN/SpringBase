package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.RoleAuthority;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleAuthorityMapper {
    int deleteByPrimaryKey(String role_authority_id);

    int insert(RoleAuthority record);

    int insertSelective(RoleAuthority record);

    RoleAuthority selectByPrimaryKey(String role_authority_id);

    List<RoleAuthority> selectByRoleId(String role_id);

    int updateByPrimaryKeySelective(RoleAuthority record);

    int updateByPrimaryKey(RoleAuthority record);
}