package com.corunet.technicalTest.service;

import com.corunet.technicalTest.dto.PriceDto;
import com.corunet.technicalTest.model.price.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public PriceDto findByCriteria(Long productId, Long brandId, LocalDateTime applicationDate) {
        return new PriceDto(priceRepository.findFirstByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(productId, brandId, applicationDate, applicationDate));
    }
}
