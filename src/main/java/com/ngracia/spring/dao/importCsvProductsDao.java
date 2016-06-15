package com.ngracia.spring.dao;

/**
 * Created by Nestor Gracia on 15/06/2016.
 */
public interface ImportCsvProductsDao {
    void importProducts(String path, String fileName);
}
