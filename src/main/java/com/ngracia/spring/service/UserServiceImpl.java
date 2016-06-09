package com.ngracia.spring.service;

import com.ngracia.spring.dao.UserDao;
import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nestor Gracia on 02/06/2016.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void delete(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void addUser(int id) {

    }

    @Override
    @Transactional
    public void updateUser(int id) {
        userDao.updateUser(id);
    }

    @Override
    @Transactional
    public boolean getUser(int id) {
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
