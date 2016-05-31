package com.ngracia.spring.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Nestor Gracia on 31/05/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Autowired
    private UserDao dao;

    @Test
    public void getUsersList() {
        Assert.assertNotNull(dao.getUsersList());}

}
