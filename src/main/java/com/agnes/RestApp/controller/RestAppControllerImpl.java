package com.agnes.RestApp.controller;

import com.agnes.RestApp.dto.CurrencyDto;
import com.agnes.RestApp.dto.RatesDto;
import com.agnes.RestApp.dto.SortDto;
import com.agnes.RestApp.exceptionHandling.EmptyListException;
import com.agnes.RestApp.service.CurrencyService;
import com.agnes.RestApp.service.PongService;
import com.agnes.RestApp.service.SortNumbersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class RestAppControllerImpl implements RestAppController {

    private final PongService pongService;
    private final SortNumbersService sortNumbersService;
    private final CurrencyService currencyService;

    @Override
    public ResponseEntity<String> getPong() {
        if (log.isErrorEnabled())
            log.info("getPong()");

        String pong = pongService.getPong();
;
        return ResponseEntity.ok(pong);
    }

    @Override
    @CrossOrigin
    public ResponseEntity <List<Integer>> postSortedNumbers(SortDto sortDto) {

        List<Integer> numbers = sortDto.getNumbers();

        if (numbers== null || numbers.isEmpty() ) {
            throw new EmptyListException();
        }
        try {
            log.info("postSortedNumbers" + sortDto.toString());
            List<Integer> sortedNumbers = sortNumbersService.sort(sortDto);
            return ResponseEntity.status(HttpStatus.OK).body(sortedNumbers);
        }
        catch (EmptyListException e) {
            return (ResponseEntity<List<Integer>>) ResponseEntity.status(HttpStatus.NO_CONTENT);
        }
    }

    @Override
    @CrossOrigin
    public ResponseEntity<RatesDto> getCurrentCurrencyValue(CurrencyDto currency) {

            log.info("getCurrentCurrencyValue" + currency);

        RatesDto result = currencyService.getCurrency(currency);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
