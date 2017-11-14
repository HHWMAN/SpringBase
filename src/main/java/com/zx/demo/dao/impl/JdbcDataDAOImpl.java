package com.zx.demo.dao.impl;

import com.zx.demo.dao.JdbcDataDAO;
import com.zx.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by ZX on 2017/11/14.
 */
@Repository("jdbcDataDAO")
public class JdbcDataDAOImpl implements JdbcDataDAO {

    public void addUser(User user) {

    }

    public void deleteUser(String id) {

    }

    public void modifyUser(User user) {

    }

    public User getUser(User user) {
        return null;
    }
}
