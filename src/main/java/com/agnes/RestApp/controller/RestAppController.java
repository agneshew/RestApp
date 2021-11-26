package com.agnes.RestApp.controller;

import com.agnes.RestApp.dto.CurrencyDto;
import com.agnes.RestApp.dto.RatesDto;
import com.agnes.RestApp.dto.SortDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

public interface RestAppController {

    @GetMapping(value = "/status/ping", produces = {"application/json; charste=UTF-8"})
    ResponseEntity<String> getPong();

    @PostMapping(value = "/numbers/sort-command", consumes = {"application/json; charste=UTF-8"})
    @ResponseBody
    ResponseEntity <List<Integer>> postSortedNumbers(@RequestBody SortDto sortDto);

    @GetMapping(value = "/currencies/get-current-currency-value-command", produces = {"application/json; charste=UTF-8"})
    @ResponseBody
    ResponseEntity<RatesDto> getCurrentCurrencyValue(@RequestBody @Valid CurrencyDto currency);
}
