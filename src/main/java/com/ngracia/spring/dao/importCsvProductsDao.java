package com.ngracia.spring.dao;

import com.ngracia.spring.dto.RequestResponseDto;

/**
 * Created by Nestor Gracia on 15/06/2016.
 */
public interface ImportCsvProductsDao {

    RequestResponseDto importProducts(String path, String fileName);
}
