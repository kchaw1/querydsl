package com.example.querydsl.utils;

import com.example.querydsl.enums.BaseEnumGetter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.AttributeConverter;

@RequiredArgsConstructor
@Getter
public class AbstractEnumAttributeConverter<E extends Enum<E> & BaseEnumGetter> implements AttributeConverter<E, String> {

    private final Class<E> targetEnumClass;
    @Override
    public String convertToDatabaseColumn(E attribute) {
        return attribute.getValue();
    }

    @Override
    public E convertToEntityAttribute(String dbData) {
        return BaseEnumValueConverterUtil.ofDbCode(targetEnumClass, dbData);
    }
}
