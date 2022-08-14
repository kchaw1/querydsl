package com.example.querydsl.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ClientAppType implements BaseEnumGetter {
    IOS("아이오에스", "ios"),
    PC("피씨", "pc"),
    ANDROID("안드로이드", "android"),
    ETC("기타", "etc");

    private final String desc;
    private final String value;
}
