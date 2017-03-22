package com.ngracia.spring.security;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * Created by dev on 22/03/17.
 */
public class SpringMVCHibernatePermissionEvaluator implements PermissionEvaluator{

    private javax.sql.DataSource dataSource;

    public javax.sql.DataSource getDataSource() { return dataSource; }

    public void setDataSource(DataSource dataSource) {this.dataSource = dataSource;}

    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission){

        JdbcTemplate template = new JdbcTemplate(dataSource);

        Object [] args = { ((User) authentication.getPrincipal()).getUsername(), targetDomainObject.getClass().getName(), permission.toString() };

        int count = template.queryForObject("select count(*) from permissions p where p.username = ? and p.target = ? and p.permission =?", args, Integer.class);

        if(count == 1){
            return false;
        }

        return true;
    }

    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        return false;
    }
}
