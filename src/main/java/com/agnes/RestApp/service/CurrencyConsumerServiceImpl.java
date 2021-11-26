package com.agnes.RestApp.service;

import org.springframework.web.client.RestTemplate;

public class CurrencyConsumerServiceImpl implements CurrencyConsumerService{

    private final RestTemplate restTemplate;

    public CurrencyConsumerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
