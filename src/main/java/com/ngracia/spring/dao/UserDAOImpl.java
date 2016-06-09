/**
 * Created by Nestor Gracia on 25/05/2016.
 */
package com.ngracia.spring.dao;

import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public void addUser(User user) {
        try{
            throw new NotImplementedException();
        }catch (Exception ex){

        }
    }

    @Override
    public void updateUser(User user) {
        try{
            throw new NotImplementedException();
        }catch (Exception ex){

        }
    }

    @Override
    public boolean getUserById(String id) {
        try{


        }catch (Exception ex){

        }
        throw new NotImplementedException();
    }

    @Override
    public boolean LogIn(String userName, String password)
    {
        try{
            Query query = sessionFactory.getCurrentSession().createQuery("from User where name=:userName and password=:password");
            query.setParameter("userName", userName );
            query.setParameter("password", password);
            User user = (User) query.uniqueResult();
            logger.info("Success: UserDao.LogIn");
            if(user != null) {
                return true;
            }

        }catch (Exception ex ){
            logger.error("Failed: UserDao.LogIn: " + ex);
        }
        return false;
    }

    @Override
    public RequestResponseDto LogOut(String userName, String password) {
        try{

        }catch (Exception ex){

        }
        throw new NotImplementedException();
    }


    @SuppressWarnings("unchecked")
    public List<UserDto> getUsersList() {
        List<User> userList;
        List<UserDto> userListDto = new ArrayList<UserDto>();

        try{
            userList = sessionFactory.getCurrentSession().createQuery("from User").list();

            for(User user : userList){
                UserDto userDto = new UserDto();
                userDto.setId(user.getId());
                userDto.setName(user.getName());
                userDto.setEnable(user.getIsEnable());
                userListDto.add(userDto);
            }

            logger.info("Success: UserDao.GetUsersList");

        }catch (Exception ex){
            logger.error("Failed: UserDao.GetUsersList");
        }
        return userListDto;
    }
}
