package com.example.querydsl.repository;

import com.example.querydsl.entity.Clients;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

import static com.example.querydsl.entity.QClients.clients;

@RequiredArgsConstructor
public class ClientsRepositoryCustomImpl implements ClientsRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Optional<Clients> getClientInfoByClientId(Long clientId) {
        return Optional.ofNullable(jpaQueryFactory.selectFrom(clients)
                .leftJoin(clients.fileInfo)
                .leftJoin(clients.clientApps)
                .where(clients.clientId.eq(clientId))
                .fetchJoin()
                .fetchFirst());
    }
}
