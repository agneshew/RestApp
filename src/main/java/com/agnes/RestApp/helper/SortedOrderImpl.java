package com.agnes.RestApp.helper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Slf4j
public class SortedOrderImpl implements SortedOrder{

    @Override
    public List<Integer> sortInAscOrder(List<Integer> numbers) {

        if (log.isErrorEnabled()) {
            log.info("SortInAscOrder()" + numbers.toString());
        }

        List<Integer> sortedCopy = new ArrayList<>(numbers);
        Collections.sort(sortedCopy);

        return sortedCopy;
    }

    @Override
    public List<Integer> sortInDescOrder(List<Integer> numbers) {

        if (log.isErrorEnabled())
            log.info("sortInDescOrder()"  + numbers.toString());

        List<Integer> sortedCopy = new ArrayList<>(numbers);
        sortedCopy.sort(Collections.reverseOrder());

        return sortedCopy;
    }
}
