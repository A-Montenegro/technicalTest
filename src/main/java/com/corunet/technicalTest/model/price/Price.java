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

    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private Integer priority;
    private BigDecimal price;
    private String curr;

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

    public LocalDateTime getStart_date() {
        return start_date;
    }

    public LocalDateTime getEnd_date() {
        return end_date;
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
}
