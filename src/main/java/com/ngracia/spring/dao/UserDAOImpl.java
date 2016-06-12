/**
 * Created by Nestor Gracia on 25/05/2016.
 */
package com.ngracia.spring.dao;

import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.dto.UserDto;
import com.ngracia.spring.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
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
            logger.info("Success: UserDao.addUser");
        }catch (Exception ex){
            logger.error("Success: UserDao.addUser");
        }
    }

    @Override
    public void updateUser(UserDto userDto) {
        try{
            Session session;
            User user = new User();

            session = sessionFactory.getCurrentSession();


            user.setId(userDto.getId());
            user.setPassword(userDto.getPassword());
            user.setIsEnable(userDto.getIsEnable());
            user.setName(userDto.getName());

            session.update(user);
            session.flush();
            logger.info("Success: UserDao.updateUser");

        }catch (Exception ex){
            logger.error("Failed: UserDao.updateUser: " + ex);
        }
    }

    @Override
    public void deleteUser(int id) {
        try{
            Session session;
            session = sessionFactory.getCurrentSession();
            User user = (User)session.load(User.class, id);
            session.delete(user);
            logger.info("Success: UserDao.deleteUser");
        }catch(Exception ex){
            logger.error("Failed: UserDao.deleteUser: " + ex);
        }
    }

    @Override
    public UserDto getUserById(int id) {
        UserDto userDto = new UserDto();
        try{

            Session session;
            session = sessionFactory.getCurrentSession();
            User user = (User)session.load(User.class, id);

            userDto.setName(user.getName());
            userDto.setId(user.getId());
            userDto.setIsEnable(user.getIsEnable());
            userDto.setPassword(user.getPassword());
            logger.info("Success : UserDao.getUserById");

        }catch (Exception ex){
            logger.error("Failure : User.getUserById " + ex.getMessage());
        }
        return userDto;
    }

    @Override
    public boolean LogIn(String userName, String password)
    {
        try{
            Query query = sessionFactory.getCurrentSession().createQuery("from User where name=:userName and password=:password and isEnable=:true");
            query.setParameter("userName", userName );
            query.setParameter("password", password);
            User user = (User) query.uniqueResult();
            logger.info("Success: UserDao.LogIn");
            if(user != null) {
                return true;
            }

        }catch (Exception ex ){
            logger.error("Failed: UserDao.LogIn: " + ex.getMessage());
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
                userDto.setIsEnable(user.getIsEnable());
                userListDto.add(userDto);
            }

            logger.info("Success: UserDao.GetUsersList");

        }catch (Exception ex){
            logger.error("Failed: UserDao.GetUsersList " + ex.getMessage());
        }
        return userListDto;
    }
}
