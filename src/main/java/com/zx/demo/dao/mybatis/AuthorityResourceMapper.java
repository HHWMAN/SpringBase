package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.AuthorityResource;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityResourceMapper {
    int deleteByPrimaryKey(String authority_resource_id);

    int insert(AuthorityResource record);

    int insertSelective(AuthorityResource record);

    AuthorityResource selectByPrimaryKey(String authority_resource_id);

    int updateByPrimaryKeySelective(AuthorityResource record);

    int updateByPrimaryKey(AuthorityResource record);
}