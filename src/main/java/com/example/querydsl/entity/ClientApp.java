package com.example.querydsl.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "client_app_info")
public class ClientApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientAppId;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "client_id")
    private Clients clients;

//    @Convert(converter = ClientAppTypeConverter.class)
    private String type;
}
