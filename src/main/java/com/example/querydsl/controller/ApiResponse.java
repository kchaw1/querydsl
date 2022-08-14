package com.example.querydsl.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse <T> {

    private int code;
    private T body;

    public static <T> ApiResponse of(int code, T body) {
        return new ApiResponse(code, body);
    }
}
