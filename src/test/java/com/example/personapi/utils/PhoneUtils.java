package com.example.personapi.utils;

import com.example.personapi.dto.request.PhoneDTO;
import com.example.personapi.entity.Phone;
import com.example.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "(85) 8514-1804";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
