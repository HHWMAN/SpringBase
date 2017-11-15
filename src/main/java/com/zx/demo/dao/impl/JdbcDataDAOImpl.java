package com.zx.demo.dao.impl;

import com.zx.demo.dao.JdbcDataDAO;
import com.zx.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by ZX on 2017/11/14.
 */
@Repository
public class JdbcDataDAOImpl  implements JdbcDataDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUser(User user) {
        String sql = "insert into user (id, username, password) values (?, ?, ?)";
        user.setId("1");
        user.setUsername("zx");
        user.setPassowrd("zx");
        jdbcTemplate.update(sql,user.getId(), user.getUsername(), user.getPassowrd());

    }

    public void deleteUser(String id) {

    }

    public void modifyUser(User user) {

    }

    public User getUser(User user) {
        return null;
    }
}
