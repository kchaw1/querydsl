package com.example.querydsl.repository;

import com.example.querydsl.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients, Long>, ClientsRepositoryCustom {
}
