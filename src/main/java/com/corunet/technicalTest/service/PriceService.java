package com.corunet.technicalTest.service;

import com.corunet.technicalTest.model.price.Price;
import com.corunet.technicalTest.model.price.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Price getOne(Long id){
        return priceRepository.findById(id).get();
    }

    public List<Price> findAll(){

        return priceRepository.findAll();
    }
}
