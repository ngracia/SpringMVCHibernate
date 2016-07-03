package com.ngracia.spring.dao;

import com.ngracia.spring.dto.RequestResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Nestor Gracia on 15/06/2016.
 */
public class ImportCsvProductsDaoImpl implements ImportCsvProductsDao{

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Override
    public RequestResponseDto importProducts(String path, String fileName) {
        RequestResponseDto requestResponseDto = new RequestResponseDto();
        try {

            requestResponseDto.setCode("0");
            requestResponseDto.setMessage("Success");
            logger.info("Success : ImportCsvProductsDaoImpl.importProducts");

        }catch(Exception ex){
            logger.error("Failed: ImportCsvProductsDaoImpl.importProducts " + ex);
        }
        return requestResponseDto;
    }
}
