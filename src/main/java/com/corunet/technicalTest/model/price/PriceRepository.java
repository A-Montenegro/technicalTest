package com.corunet.technicalTest.model.price;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface PriceRepository extends JpaRepository<Price, Long> {
    Price findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(Long productId, Long brandId, LocalDateTime startDate, LocalDateTime endDate);
}


