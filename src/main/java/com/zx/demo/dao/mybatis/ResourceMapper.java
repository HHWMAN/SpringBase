package com.zx.demo.dao.mybatis;

import com.zx.demo.domain.mybatis.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(String resource_id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(String resource_id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}