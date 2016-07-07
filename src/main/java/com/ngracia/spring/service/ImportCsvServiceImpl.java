package com.ngracia.spring.service;

import com.ngracia.spring.dao.ProductsDao;
import com.ngracia.spring.dto.ProductsDto;
import com.ngracia.spring.dto.RequestResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nestor Gracia on 12/06/2016.
 */
public class ImportCsvServiceImpl implements ImportCsvService{

    @Autowired
    private ProductsDao productsDao;

    @Override
    @Transactional
    public RequestResponseDto importProductsListCsv(String path, String fileName) {

        String directoryPath = path;
        String csvFile = fileName;
        BufferedReader bufferedReader = null;
        String line = "";
        String csvSplitBy = ",";
        List<ProductsDto> productsDtoList = new ArrayList<>();
        ProductsDto productsDto = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path + csvFile));
            while((line = bufferedReader.readLine()) != null){

                String[] product = line.split(csvSplitBy);

                productsDto = new ProductsDto();
                productsDto.setBarcode(product[0]);
                productsDto.setDescription(product[2]);
                productsDto.setPrice(Long.parseLong(product[3]));
                productsDtoList.add(productsDto);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
         return productsDao.save(productsDtoList);
    }
}
