package com.zx.demo.dao;

import com.zx.demo.domain.User;

/**
 * Created by ZX on 2017/11/14.
 */
public interface UserDao {

    void addUser(User user);

    void deleteUser(String id);

    void modifyUser(User user);

    User getUser(User user);


}