package com.agnes.RestApp.webClient.consumer;

import lombok.Getter;

import java.util.List;

@Getter
public class CurrencyConsumer {

    //private String code;
    //private String currency;
    private List<CurrencyRateConsumer> rates;
    //private String table;

}
