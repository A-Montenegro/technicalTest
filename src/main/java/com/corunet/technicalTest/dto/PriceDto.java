package com.corunet.technicalTest.dto;

import com.corunet.technicalTest.model.price.Price;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PriceDto {

    private Long productId;
    private Long brandId;
    private String priceRateDescription;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;

    public PriceDto(Price price) {
        this.productId = price.getProduct().getId();
        this.brandId = price.getBrand().getId();
        this.priceRateDescription = price.getPriceRate().getDescription();
        this.startDate = price.getStartDate();
        this.endDate = price.getEndDate();
        this.price = price.getPrice();
    }

    public Long getProductId() {
        return productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public String getPriceRateDescription() {
        return priceRateDescription;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
