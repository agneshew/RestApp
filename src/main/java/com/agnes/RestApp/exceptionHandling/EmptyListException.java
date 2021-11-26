package com.agnes.RestApp.exceptionHandling;

public class EmptyListException extends IllegalArgumentException{

    private static final String EXCEPTION_MESSAGE = "The provided list is empty";

    public EmptyListException() {
        super(EXCEPTION_MESSAGE);
    }

}
