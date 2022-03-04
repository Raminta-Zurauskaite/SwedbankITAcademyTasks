package com.itacademy.java.oop.basics;

public enum Position {
    MANAGER("M1"),
    SUPERVISER("S1"),
    OFFICE_WORKER("OW1"),
    JANITOR("J1");

    public final String position;

    Position(String position){
        this.position = position;
    }

    public static Position valueOfCode(String position){
        for (Position e : values()){
            if (e.position.equals(position)){
                return e;
            }
        }
        return null;
    }
}
