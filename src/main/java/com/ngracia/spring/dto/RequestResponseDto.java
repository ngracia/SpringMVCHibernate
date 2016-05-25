package com.ngracia.spring.dto;

/**
 * Created by Nestor Gracia on 25/05/2016.
 */
public class RequestResponseDto {
    private String code;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
