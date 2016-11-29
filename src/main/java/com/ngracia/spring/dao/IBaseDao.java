package com.ngracia.spring.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dev on 28/11/16.
 */
public interface IBaseDao<T> {

    Serializable save(T t);

    void delete(T t);

    void update(T t);

    void saveOrUpdate(T t);

    List<T> find(String hq);

    List findSQL(String hq, Class T);

    List findSQL(String hq);

    List<T> find(String hq, Object[] param);

    List<T> find(String hq, List<Object> param);
}
