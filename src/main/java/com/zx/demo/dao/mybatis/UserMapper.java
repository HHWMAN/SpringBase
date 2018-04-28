package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.User;

public interface UserMapper {
    int deleteByPrimaryKey(String user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String user_id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}