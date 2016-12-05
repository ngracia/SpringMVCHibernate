package com.ngracia.spring.service;

import com.ngracia.spring.dao.BaseDao;
import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nestor Gracia on 02/06/2016.
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    private BaseDao<User> userDao;

    @Autowired
    public void setUserDao(BaseDao<User> userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void delete(int id) {
        /*userDao.deleteUser(id);*/
    }

    @Override
    public void addUser(int id) {

    }

    @Override
    @Transactional
    public void updateUser(UserDto userDto) {
        /*userDao.updateUser(userDto);*/
    }

    @Override
    @Transactional
    public UserDto getUser(int id) {
        return null; /*userDao.getUserById(id);*/
    }

    @Override
    @Transactional
    public User LogIn(String name, String password) {
        return userDao.get("from user u where u.name = ? and u.password = ?", new Object[] { name, password});
    }

    @Override
    @Transactional
    public RequestResponseDto LogOut(String userName, String password) {
        return null;
    }


    @Override
    @Transactional
    public List<UserDto> getUsersList() {
        return null;
    }
}
