package com.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commodity {
    @Id
    @GeneratedValue
    private Integer cid; //商品编号
    private String name;       //商品名称
    private Double price;       //商品价格
    private Integer quantity;       //商品数量
    private Double discount;    //折扣

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCid() {
        return cid;
    }

    public double getDiscount() {
        return discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}