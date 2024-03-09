package com.amir.RestApi.external;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Component
public class ExchangeRateClient {
    private final RestTemplate restTemplate;
    private final String accessToken;
    private final String url;


    public ExchangeRateClient(
            RestTemplate restTemplate,
            @Value("${external.api.exchange_rate.token}") String accessToken,
            @Value("${external.api.exchange_rate.uri}") String url){
        this.restTemplate = restTemplate;
        this.accessToken =accessToken;
        this.url  = url;
    }

    public ExternalResponse getLatestExchangeRate(String targetCurrency) {
        String endpoint = url + "/v6/" + accessToken + "/latest/" + targetCurrency;

        return restTemplate.getForObject(endpoint, ExternalResponse.class);
    }

    record ExternalResponse(@JsonProperty("conversion_rates") Map<String, Double> conversionRate) {
    }
}
