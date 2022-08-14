package com.example.querydsl.exception;

import com.example.querydsl.controller.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(ClientNotFoundException.class)
    public ResponseEntity<ApiResponse> handleClientNotFoundException(ClientNotFoundException clientNotFoundException) {
        Map<String, Object> body = new HashMap<>();

        body.put("time", LocalDateTime.now());
        body.put("message", clientNotFoundException.getMessage());
        body.put("error", clientNotFoundException.getClass());

        return new ResponseEntity<>(
                ApiResponse.of(
                        HttpStatus.NOT_FOUND.value(),
                        body), HttpStatus.NOT_FOUND);
    }
}
