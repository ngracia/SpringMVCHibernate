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
    void updateUser(User user);
    boolean getUser(String id);
    RequestResponseDto getLogin(String userName, String password);
    List<UserDto> getUsersList();
}
