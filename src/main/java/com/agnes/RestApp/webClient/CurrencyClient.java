package com.agnes.RestApp.webClient;

import com.agnes.RestApp.dto.CurrencyDto;
import com.agnes.RestApp.dto.RatesDto;
import com.agnes.RestApp.webClient.consumer.CurrencyConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class CurrencyClient {

    private static final String CURRENCY_URL_1 = "http://api.nbp.pl/api/exchangerates/rates/A/";
    private static final String CURRENCY_URL_2 = "/?format=json";

    private final RestTemplate restTemplate = new RestTemplate();

    public RatesDto getRateForCurrency(CurrencyDto currencyDto) {

        CurrencyConsumer currencyConsumer = restTemplate.getForObject(CURRENCY_URL_1 + "{currency}" + CURRENCY_URL_2, CurrencyConsumer.class, currencyDto.getCurrency());

        return RatesDto.builder()
                .value(currencyConsumer.getRates().get(0).getMid())
                .build();
    }
}
