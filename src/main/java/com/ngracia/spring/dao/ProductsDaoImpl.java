/**
 * Created by Nestor Gracia on 25/05/2016.
 */
package com.ngracia.spring.dao;

import com.ngracia.spring.dto.ProductsDto;
import com.ngracia.spring.dto.RequestResponseDto;
import com.ngracia.spring.model.Products;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductsDaoImpl implements ProductsDao {

    private static final Logger logger = LoggerFactory.getLogger(ProductsDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public RequestResponseDto save(List<ProductsDto> productDtoList) {

        RequestResponseDto requestResponseDto = new RequestResponseDto();
        requestResponseDto.setCode("1");
        requestResponseDto.setMessage("Success");

        try{
            Session session = sessionFactory.getCurrentSession();

            Products products = null;
            for (ProductsDto productsDto : productDtoList){
                products = new Products();
                products.setDescription(productsDto.getDescription());
                products.setBarcode(productsDto.getBarcode());
                products.setQty(productsDto.getQty());
                products.setPrice(productsDto.getPrice());

                session.save(products);
                session.flush();
            }
            logger.info("Success: ProductsDao.save");
        }catch (Exception ex){
            logger.error("Success: UserDao.addUser");
        }
        return requestResponseDto;
    }

    @SuppressWarnings("unchecked")
    public List<ProductsDto> getProductList() {
        List<Products> productList;
        List<ProductsDto> productsDtoList = new ArrayList<>();
        ProductsDto productsDto = null;

        try{
            productList = sessionFactory.getCurrentSession().createQuery("from Products").list();

            for(Products products : productList){
                productsDto = new ProductsDto();
                productsDto.setId(products.getId());
                productsDto.setBarcode(products.getBarcode());
                productsDto.setPrice(products.getPrice());
                productsDto.setDescription(products.getDescription());
                productsDto.setQty(products.getQty());
                productsDtoList.add(productsDto);
            }

            logger.info("Success: ProductDao.getProductList");

        }catch (Exception ex){
            logger.error("Failed: ProductDao.getProductList " + ex.getMessage());
        }
        return productsDtoList;
    }
    @Override
    public void updateProduct(ProductsDto productsDto) {

        try{
            Products products = new Products();
            Session session;
            session = sessionFactory.getCurrentSession();

            products.setId(productsDto.getId());
            products.setBarcode(productsDto.getBarcode());
            products.setDescription(productsDto.getDescription());
            products.setQty(productsDto.getQty());
            products.setPrice(productsDto.getPrice());

            session.update(products);
            session.flush();

            logger.info("Success: ProductDao.updateProduct");
        }catch (Exception ex){
            logger.error("Failed: ProductDao.updateProduct: " + ex);
        }
    }

    @Override
    public void deleteProduct(int id) {
        try{
            Query query = sessionFactory.getCurrentSession().createQuery("From products where id=:id");
            query.setParameter("id",id);
            query.uniqueResult();

            logger.info("Success: ProductDao.deleteProduct");
        }catch(Exception ex){
            logger.error("Failed: ProductDao.deleteProduct: " + ex);
        }
    }

    @Override
    public ProductsDto getProductById(int id) {
        ProductsDto productsDto = new ProductsDto();
        Session session;
        try{
            Query query = sessionFactory.getCurrentSession().createQuery("from products where id=:id");
            query.setParameter("id", id);
            Products products = (Products) query.uniqueResult();
            productsDto.setId(products.getId());
            productsDto.setBarcode(products.getBarcode());
            productsDto.setDescription(products.getDescription());
            productsDto.setPrice(products.getPrice());
            productsDto.setQty(products.getQty());

            logger.info("Success: ProductDao.getProductById");
        }catch (Exception ex){
            logger.error("Failure : User.getProductById " + ex.getMessage());
        }
        return productsDto;
    }

}
