package com.example.querydsl.controller;

import com.example.querydsl.dto.ClientAppDto;
import com.example.querydsl.service.ClientsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientsController {

    private final ClientsService clientsService;

    @GetMapping("/{clientId}")
    public ResponseEntity<ApiResponse> getClientInfo(@PathVariable("clientId") Long clientId) {
        return new ResponseEntity<>(ApiResponse.of(
                HttpStatus.OK.value(),
                clientsService.getClientInfo(clientId)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> saveClientAppInfo(ClientAppDto clientAppDto) {
        clientsService.saveClientAppInfo(clientAppDto);

        return new ResponseEntity<>(ApiResponse.of(
                HttpStatus.OK.value(),
                "저장되었습니다."), HttpStatus.OK);
    }
}
