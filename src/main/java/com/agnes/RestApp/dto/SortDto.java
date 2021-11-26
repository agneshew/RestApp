package com.agnes.RestApp.dto;

import com.agnes.RestApp.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class SortDto {

    private final List<Integer> numbers;
    private final Order order;
}
