package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.Authority;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityMapper {
    int deleteByPrimaryKey(String authority_id);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(String authority_id);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}