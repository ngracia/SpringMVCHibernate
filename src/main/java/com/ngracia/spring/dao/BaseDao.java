package com.ngracia.spring.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dev on 28/11/16.
 */
public interface BaseDao<T> {

    Serializable save(T t);

    void delete(T t);

    void update(T t);

    void saveOrUpdate(T t);

    T get(String hql, Object[] param);

}
