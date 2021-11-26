package com.agnes.RestApp.service;

import com.agnes.RestApp.dto.CurrencyDto;
import com.agnes.RestApp.dto.RatesDto;
import com.agnes.RestApp.webClient.CurrencyClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CurrencyServiceImpl implements CurrencyService {

    private final CurrencyClient currencyClient;

    @Override
    public RatesDto getCurrency(CurrencyDto currency) {

            log.info("getCurrency" + currency);

        RatesDto ratesDto = currencyClient.getRateForCurrency(currency);

        return ratesDto;
    }
}
