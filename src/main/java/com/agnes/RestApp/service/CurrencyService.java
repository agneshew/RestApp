package com.agnes.RestApp.service;

import com.agnes.RestApp.dto.CurrencyDto;
import com.agnes.RestApp.dto.RatesDto;
import org.springframework.stereotype.Service;

@Service
public interface CurrencyService {

    RatesDto getCurrency(CurrencyDto currency);

}
