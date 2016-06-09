/**
 * Created by Nestor Gracia on 25/05/2016.
 */
package com.ngracia.spring.dao;

import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;
import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(UserDto userDto);
    void deleteUser(int id);
    UserDto getUserById(int id);
    boolean LogIn(String userName, String password);
    RequestResponseDto LogOut(String userName, String password);
    List<UserDto> getUsersList();
}
