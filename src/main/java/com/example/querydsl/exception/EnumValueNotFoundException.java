package com.example.querydsl.exception;

public class EnumValueNotFoundException extends RuntimeException{
    public EnumValueNotFoundException(String message) {
        super(message);
    }
}
