package com.agnes.RestApp.service;

import org.springframework.web.client.RestTemplate;

public class CurrencyConsumerService {

    private final RestTemplate restTemplate;

    public CurrencyConsumerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
