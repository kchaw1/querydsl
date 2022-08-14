package com.example.querydsl.utils;

import com.example.querydsl.dto.ClientResponseDto;
import com.example.querydsl.entity.Clients;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper( ClientMapper.class );

    ClientResponseDto toDto(Clients clients);
}
