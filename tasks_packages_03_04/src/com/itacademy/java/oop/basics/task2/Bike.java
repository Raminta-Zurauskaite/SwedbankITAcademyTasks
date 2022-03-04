package com.itacademy.java.oop.basics.task2;

public enum Bike {
    mountain("M"),
    road("R");

    public final String bike;

    Bike(String bike) {
        this.bike = bike;
    }

    public static Bike valueOfCode(String bike) {
        for (Bike e : values()) {
            if (e.bike.equals(bike)) {
                return e;
            }
        }
        return null;
    }
}
