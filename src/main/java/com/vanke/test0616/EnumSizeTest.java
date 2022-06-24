package com.vanke.test0616;

public enum EnumSizeTest {
    SMALLfS("S"),
    MEDIUMC("M"),
    LARGEfL("L"),
    EXTRA_LARGE("XL");

    private String abbreviation;
    EnumSizeTest(String abbreviation) {
        this.abbreviation=abbreviation;
    }
    enum Size{
        min,
        max,
        pro_max;
    }
}
