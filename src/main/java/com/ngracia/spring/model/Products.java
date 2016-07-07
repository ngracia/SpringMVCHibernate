package com.ngracia.spring.model;
import javax.persistence.*;

/**
 * Created by Nestor Gracia on 12/06/2016.
 */
@Entity
@Table(name = "products")
public class Products {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="description")
    private String description;

    @Column(name="qty")
    private int qty;

    @Column(name="barcode")
    private String barcode;

    @Column(name="price")
    private long price;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {this.qty = qty;}

    public String getDescription() { return description; }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarcode() { return barcode; }

    public void setBarcode(String barcode) { this.barcode = barcode; }

    public long getPrice() {return price;}

    public void setPrice(long price) {this.price = price;}
}
