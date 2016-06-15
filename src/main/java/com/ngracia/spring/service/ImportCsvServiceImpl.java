package com.ngracia.spring.service;

import com.ngracia.spring.dao.ImportCsvProductsDao;
import com.ngracia.spring.dto.RequestResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Nestor Gracia on 12/06/2016.
 */
public class ImportCsvServiceImpl implements ImportCsvService{

    @Autowired
    private ImportCsvProductsDao importCsvProductsDao;


    @Override
    @Transactional
    public RequestResponseDto importProductsListCsv(String path, String fileName) {
        importCsvProductsDao.importProducts(path, fileName);
        return null;
    }
}
