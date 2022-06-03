package com.tanto.roadover.enums;

public enum DirtType implements Enumeration<String> {

    HAS_DIRT("HAS_DIRT"),
    MANEUVER_NEEDED("MANEUVER_NEEDED"),
    SLOWDOWN_NEEDED("SLOWDOWN_NEEDED");

    private final String string;

    DirtType(String value) {
        this.string = value;
    }

    @Override
    public String getType() {
        return string;
    }

}
