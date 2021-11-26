package com.agnes.RestApp;

import com.agnes.RestApp.model.Order;
import com.agnes.RestApp.model.Pong;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ModelTest {

    @Test
    public void shouldReturnPong() {

        //Given
        Pong pong = new Pong();
        //When&Then
        assertEquals("pong", pong.getPONG());
    }

    @Test
    public void shouldReturnASC() {

        //Given
       Order order = Order.ASC;
        //When&Them
        assertEquals(Order.valueOf("ASC"), order);
    }

    @Test
    public void shouldReturnDESC() {

        //Given
        Order order = Order.DESC;
        //When&Them
        assertEquals(Order.valueOf("DESC"), order);
    }
}
