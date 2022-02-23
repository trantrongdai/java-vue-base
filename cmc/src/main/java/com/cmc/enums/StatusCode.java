package com.cmc.enums;

public enum StatusCode {

    SUCCESS(0),
    FAILED(1);

    private Integer value;

    StatusCode(Integer newValue) {
        value = newValue;
    }

    public Integer getValue() {
        return value;
    }
}
