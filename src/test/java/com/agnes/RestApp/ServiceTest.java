package com.agnes.RestApp;

import com.agnes.RestApp.dto.SortDto;
import com.agnes.RestApp.helper.SortedOrderImpl;
import com.agnes.RestApp.model.Order;
import com.agnes.RestApp.model.Pong;
import com.agnes.RestApp.service.PongServiceImpl;
import com.agnes.RestApp.service.SortNumbersServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {

    @Test
    public void shouldReturnPongFromService() {
        //Given
        Pong pong = new Pong();
        PongServiceImpl service = new PongServiceImpl(pong);
        //When&Then
        assertEquals("pong", service.getPong());
    }

    @Test
    public void shouldReturnSortedListFromService() {
        //Given
        SortedOrderImpl sortedOrder = new SortedOrderImpl();
        SortNumbersServiceImpl service = new SortNumbersServiceImpl(sortedOrder);
        List<Integer> intList = List.of(4, 2, 7, 6);

        SortDto sortDtoAsc = new SortDto(intList, Order.ASC);
        SortDto sortDtoDesc = new SortDto(intList, Order.ASC);

        List<Integer> sortedAscList = List.of(2, 4, 6, 7);
        List<Integer> sortedDescList = List.of(7, 6, 4, 2);

        //When&Then
        assertEquals(sortedAscList, service.sort(sortDtoAsc));
        assertEquals(sortedDescList, service.sort(sortDtoDesc));
        }
}


