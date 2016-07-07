/**
 * Created by Nestor Gracia on 25/05/2016.
 */
package com.ngracia.spring.dao;

import com.ngracia.spring.dto.ProductsDto;
import com.ngracia.spring.dto.RequestResponseDto;

import java.util.List;

public interface ProductsDao {

    RequestResponseDto save(List<ProductsDto> productsDto);

    List<ProductsDto> getProductList();

    void updateProduct(ProductsDto productsDto);

    void deleteProduct(int id);

    ProductsDto getProductById(int id);
}
