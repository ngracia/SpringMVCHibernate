package com.ngracia.spring.dto;

/**
 * Created by Nestor Gracia on 12/06/2016.
 */
public class ProductsDto {
    private String barcode;
    private Integer id;
    private String description;
    private long price;
    private int qty;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQty() {return qty;}

    public void setQty(int qty) {this.qty = qty;}
}
