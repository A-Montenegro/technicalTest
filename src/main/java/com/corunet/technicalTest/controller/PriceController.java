package com.corunet.technicalTest.controller;

import com.corunet.technicalTest.dto.PriceDto;
import com.corunet.technicalTest.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping(value = "/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping(path = "/findByCriteria", produces= MediaType.APPLICATION_JSON_VALUE)
    public PriceDto findByCriteria(@RequestParam Long productId, @RequestParam Long brandId, @RequestParam String applicationDate){
        return  priceService.findByCriteria(productId, brandId, LocalDateTime.parse(applicationDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

}
