package com.ngracia.spring.service;

import com.ngracia.spring.dao.UserDao;
import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nestor Gracia on 02/06/2016.
 */
public class UserServiceImp implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {

    }

    @Override
    @Transactional
    public void updateUser(User user) {

    }

    @Override
    @Transactional
    public boolean getUser(String id) {
        return false;
    }

    @Override
    @Transactional
    public boolean LogIn(String userName, String password) {
        return userDao.LogIn(userName, password);
    }

    @Override
    @Transactional
    public RequestResponseDto LogOut(String userName, String password) {
        return userDao.LogOut(userName, password);
    }


    @Override
    @Transactional
    public List<UserDto> getUsersList() {
        return userDao.getUsersList();
    }
}
