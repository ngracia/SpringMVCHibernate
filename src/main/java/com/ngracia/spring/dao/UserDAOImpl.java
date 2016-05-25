package com.ngracia.spring.dao;

import com.ngracia.spring.model.User;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Nestor Gracia on 25/05/2016.
 */
public class UserDAOImpl implements UserDAO {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
    private SessionFactory sessionFactory;

    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addUser(User user) {

    }

    public void updateUser(User user) {

    }

    public boolean getUser(String id) {
        return false;
    }

    public boolean getLogin(String userName, String password) {
        return false;
    }
}
