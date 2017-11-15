package com.zx.demo.dao.impl;

import com.zx.demo.dao.UserDao;
import com.zx.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZX on 2017/11/14.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void addUser(User user) {
        String sql = "insert into user (id, username, password) values (?, ?, ?)";
        jdbcTemplate.update(sql,user.getId(), user.getUsername(), user.getPassowrd());
        int a=4/0;
    }

    public void deleteUser(String id) {

    }

    public void modifyUser(User user) {

    }

    public User getUser(User user) {
        return null;
    }
}
