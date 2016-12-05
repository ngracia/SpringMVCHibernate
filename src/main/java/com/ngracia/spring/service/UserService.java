package com.ngracia.spring.service;

import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;

import java.util.List;

/**
 * Created by Nestor Gracia on 02/06/2016.
 */
public interface UserService {

    void addUser(int id);

    void delete(int id);

    void updateUser(UserDto userDto);

    UserDto getUser(int id);

    User LogIn(String userName, String password);

    RequestResponseDto LogOut(String userName, String password);

    List<UserDto> getUsersList();
}
