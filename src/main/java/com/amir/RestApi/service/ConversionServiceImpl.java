package com.amir.RestApi.service;

import com.amir.RestApi.external.ExchangeRateClient;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class ConversionServiceImpl implements ConversionService{
    private final ExchangeRateClient client;
    public ConversionServiceImpl(ExchangeRateClient client){
        this.client = client;
    }

    @Override
    public ConversionResult convert(ConversionRequest request){
        client.getLatestExchangeRate(request.from());
        return new ConversionResult(15.0, ZonedDateTime.now());
    }
}
