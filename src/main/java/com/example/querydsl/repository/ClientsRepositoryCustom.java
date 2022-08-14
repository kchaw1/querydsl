package com.example.querydsl.repository;

import com.example.querydsl.entity.Clients;

import java.util.Optional;

public interface ClientsRepositoryCustom {

    Optional<Clients> getClientInfoByClientId(Long clientId);
}
