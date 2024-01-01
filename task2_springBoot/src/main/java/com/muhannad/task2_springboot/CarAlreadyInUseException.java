package com.muhannad.task2_springboot;

public class CarAlreadyInUseException extends RuntimeException{
    public CarAlreadyInUseException(String message) {
        super(message);
    }
}
