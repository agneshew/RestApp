package com.agnes.RestApp.service;

import com.agnes.RestApp.dto.SortDto;
import com.agnes.RestApp.helper.SortedOrder;
import com.agnes.RestApp.model.Order;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class SortNumbersServiceImpl implements SortNumbersService{

    private final SortedOrder sortedOrder;

    @Override
    public List<Integer> sort (SortDto sortDto) {

        List <Integer> listToSort = sortDto.getNumbers();
        Order order = sortDto.getOrder();

            log.info("sort in order: " + order.toString() +" list: " + listToSort.toString());

        if (Order.ASC == order) {
            return sortedOrder.sortInAscOrder(listToSort);
        }
        return sortedOrder.sortInDescOrder(listToSort);
    }
}
