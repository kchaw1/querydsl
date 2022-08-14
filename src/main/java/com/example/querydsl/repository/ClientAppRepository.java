package com.example.querydsl.repository;

import com.example.querydsl.entity.ClientApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientAppRepository extends JpaRepository<ClientApp, Long> {
}
