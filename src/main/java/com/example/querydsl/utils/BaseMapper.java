package com.example.querydsl.utils;

public interface BaseMapper<D,E> {

    D toDto(E e);

    E toEntity(D d);

}
