package com.corunet.technicalTest.controller;

import com.corunet.technicalTest.model.price.Price;
import com.corunet.technicalTest.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping("/all")
    public List<Price> findAll(){
        return priceService.findAll();
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Price getOne(@PathVariable("id") Long id){
        Price price = priceService.getOne(id);
        return price;
    }
}
