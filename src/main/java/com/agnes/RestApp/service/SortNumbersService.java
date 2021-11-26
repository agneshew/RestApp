package com.agnes.RestApp.service;

import com.agnes.RestApp.dto.SortDto;

import java.util.List;

public interface SortNumbersService {

    List<Integer> sort (SortDto sortDto);
}
