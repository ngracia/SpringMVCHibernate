package com.ngracia.spring.dao.impl;

import com.ngracia.spring.dao.IBaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dev on 29/11/16.
 */
@Repository("baseDao")
public class BaseDaoImpl<T> implements IBaseDao<T>{

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable save(T t) {
        return this.getCurrentSession().save(t);
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public void saveOrUpdate(T t) {

    }

    @Override
    public List<T> find(String hq) {
        return null;
    }

    @Override
    public List findSQL(String hq, Class T) {
        return null;
    }

    @Override
    public List findSQL(String hq) {
        return null;
    }

    @Override
    public List<T> find(String hq, Object[] param) {
        return null;
    }

    @Override
    public List<T> find(String hq, List<Object> param) {
        return null;
    }
}
