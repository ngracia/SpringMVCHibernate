package com.ngracia.spring.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Nestor Gracia on 01/06/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoImplTest {


    @Autowired
    private UserDao dao;

    @Test
    public void addUser() throws Exception {

    }

    @Test
    public void updateUser() throws Exception {

    }

    @Test
    public void getUser() throws Exception {

    }

    @Test
    public void getLogin() throws Exception {

    }

    @Test
    public void getUsersList() {
        Assert.assertNotNull(dao.getUsersList());}

}