package com.ngracia.spring.dto;

/**
 * Created by Nestor Gracia on 25/05/2016.
 */
public class UserDto {

    private int id;
    private String name;
    private boolean isEnable;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
