package com.itacademy.java.oop.basics.task1;

public class Square extends Shape {
    private double fieldSide;

    public Square(double fieldSide) {
        this.fieldSide = fieldSide;
    }

    @Override
    double calculateArea(double fieldSide) {
        return fieldSide * fieldSide;
    }

    @Override
    double calculatePerimeter(double fieldSide) {
        return 4 * fieldSide;
    }

    @Override
    public String toString() {
        return "Square{" + "fieldSide=" + fieldSide + '}' + "Its area is " + calculateArea(fieldSide) + " and its perimeter is " + calculatePerimeter(fieldSide);
    }
}
