package com.ngracia.spring.service;

import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;
import java.util.List;

/**
 * Created by Nestor Gracia on 02/06/2016.
 */
public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    boolean getUser(String id);

    boolean LogIn(String userName, String password);

    RequestResponseDto LogOut(String userName, String password);

    List<UserDto> getUsersList();
}
