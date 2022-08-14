package com.example.querydsl.dto;

import com.example.querydsl.entity.FileInfo;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ClientResponseDto {

    private Long clientId;
    private String clientName;
    private LocalDateTime created;
    private LocalDateTime updated;
    private List<ClientAppDto> clientApps;
    private FileInfo fileInfo;
}
