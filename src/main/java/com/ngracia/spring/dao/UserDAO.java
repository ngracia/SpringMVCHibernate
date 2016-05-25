package com.ngracia.spring.dao;

import com.ngracia.spring.model.User;

/**
 * Created by Nestor Gracia on 25/05/2016.
 */
public interface UserDAO {
    public void addUser(User user);
    public void updateUser(User user);
    public boolean getUser(String id);
    public boolean getLogin(String userName, String password);
}
