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

    public void addUser(){
        User user = new User();
        user.setUser_id("2");
        user.setUsername("zx_mybatis");
        user.setPassword("zx_mybatis");
        /*user.setSex("m");
        user.setRec_create_time("a");
        user.setRec_creator("zx");
        user.setRec_revisor("zx");
        user.setRec_revisor_time("b");*/
        userMapper.insert(user);
    }
}
