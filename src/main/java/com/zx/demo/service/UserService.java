package com.zx.demo.service;

import com.zx.demo.dao.mybatis.UserMapper;
import com.zx.demo.domain.mybatis.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ZX on 2017/11/15.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User user){
       int result = userMapper.insert(user);
       return result;
    }

    public int deleteUserById(String userId){
        int result = userMapper.deleteByPrimaryKey(userId);
        return result;
    }
}
