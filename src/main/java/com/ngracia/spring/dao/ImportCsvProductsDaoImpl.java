package com.ngracia.spring.dao;

import com.ngracia.spring.dto.RequestResponseDto;

/**
 * Created by Nestor Gracia on 15/06/2016.
 */
public class ImportCsvProductsDaoImpl implements ImportCsvProductsDao{
    @Override
    public RequestResponseDto importProducts(String path, String fileName) {
        RequestResponseDto requestResponseDto = new RequestResponseDto();
        requestResponseDto.setCode("0");
        requestResponseDto.setMessage("Success");
        return requestResponseDto;
    }
}
