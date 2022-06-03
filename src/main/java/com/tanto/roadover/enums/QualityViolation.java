package com.tanto.roadover.enums;

public enum QualityViolation implements Enumeration<String> {

    EXTREME("EXTREME"),
    LOW("LOW"),
    MID("MID"),
    HIGH("HIGH");

    private final String string;

    QualityViolation(String value) {
        this.string = value;
    }

    @Override
    public String getType() {
        return string;
    }

}
