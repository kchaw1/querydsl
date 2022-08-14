package com.example.querydsl.utils;

import com.example.querydsl.enums.BaseEnumGetter;
import com.example.querydsl.exception.EnumValueNotFoundException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import java.util.EnumSet;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BaseEnumValueConverterUtil {
    public static <T extends Enum<T> & BaseEnumGetter> T ofDbCode(Class<T> enumClass, String code) {
        if(!StringUtils.hasText(code)) return null;

        return EnumSet.allOf(enumClass).stream()
                .filter(e -> e.getValue().equals(code))
                .findAny()
                .orElseThrow(() -> new EnumValueNotFoundException(String.format("enum=[%s]에 code=[%s]가 존재하지 않습니다.", enumClass.getName(), code)));
    }
}
