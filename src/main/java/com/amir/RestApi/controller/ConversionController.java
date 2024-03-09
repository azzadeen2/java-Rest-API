package com.amir.RestApi.controller;

import com.amir.RestApi.service.ConversionRequest;
import com.amir.RestApi.service.ConversionResult;
import com.amir.RestApi.service.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Map;

@RestController
public class ConversionController {

    private final ConversionService conversionService;

    public ConversionController(ConversionService conversionService){
        this.conversionService = conversionService;
    }

//    @GetMapping("/convert")
//    public ConversionResponse Convert(
//            @RequestParam("amount") double amount,
//            @RequestParam("from") String from,
//            @RequestParam("to") String to
//    ){
//        if(amount <= 0){
//            throw new IllegalArgumentException("Amount must be positive " + amount);
//        }
//        ConversionRequest conversionRequest = new ConversionRequest(from, to, amount);
//        ConversionResult converted =
//                conversionService.convert(conversionRequest);
//
//        return new ConversionResponse(from, to, amount, converted.converted(), converted.timestamp());
//
//
//    }
}
