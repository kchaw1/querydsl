package com.example.querydsl.service;

import com.example.querydsl.dto.ClientAppDto;
import com.example.querydsl.dto.ClientResponseDto;
import com.example.querydsl.entity.Clients;
import com.example.querydsl.exception.ClientNotFoundException;
import com.example.querydsl.repository.ClientAppRepository;
import com.example.querydsl.repository.ClientsRepository;
import com.example.querydsl.utils.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientsService {

    private final ClientsRepository clientsRepository;
    private final ClientAppRepository clientAppRepository;
    private final ClientMapper clientMapper;

    public ClientResponseDto getClientInfo(Long clientId) {
        Clients result = clientsRepository.getClientInfoByClientId(clientId)
                .orElseThrow(() -> new ClientNotFoundException(String.format("[%d] 번 고객을 찾을 수 없습니다.", clientId)));
        return clientMapper.toDto(result);
    }

    public void saveClientAppInfo(ClientAppDto clientAppDto) {

    }
}
