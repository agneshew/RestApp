package com.agnes.RestApp;


import com.agnes.RestApp.helper.SortedOrder;
import com.agnes.RestApp.helper.SortedOrderImpl;
import com.agnes.RestApp.model.Pong;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SortedOrderTest {

    private final SortedOrderImpl sortedOrder = new SortedOrderImpl();

    @Test
    public void shouldReturnListInAscOrder() {
        //Given
        List<Integer> intList = List.of(4, 2, 7, 6);
        List<Integer> sortedList = List.of(2, 4, 6, 7);
        //When&Then
        assertEquals(sortedList, sortedOrder.sortInAscOrder(intList));
    }

    @Test
    public void shouldReturnListInDescOrder() {

        //Given
        List <Integer> intList = List.of(21, 567, 34, 1);
        List <Integer> sortedList = List.of(567, 34, 21, 1);
        //When&Then
        assertEquals(sortedList, sortedOrder.sortInDescOrder(intList));
    }
}
