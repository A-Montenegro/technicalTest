package com.corunet.technicalTest.model.price;

import com.corunet.technicalTest.model.brand.Brand;
import com.corunet.technicalTest.model.priceRate.PriceRate;
import com.corunet.technicalTest.model.product.Product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "price")
public class Price {

    @Id
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne()
    @JoinColumn(name = "price_rate_id")
    private PriceRate priceRate;

    @ManyToOne()
    @JoinColumn(name = "product_id")
    private Product product;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer priority;
    private BigDecimal price;
    private String curr;

    public Price() {

    }

    public Price(Long id, Brand brand, PriceRate priceRate, Product product, LocalDateTime startDate, LocalDateTime endDate, Integer priority, BigDecimal price, String curr) {
        this.id = id;
        this.brand = brand;
        this.priceRate = priceRate;
        this.product = product;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }

    public Long getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public PriceRate getPriceRate() {
        return priceRate;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurr() {
        return curr;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setPriceRate(PriceRate priceRate) {
        this.priceRate = priceRate;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }
}
