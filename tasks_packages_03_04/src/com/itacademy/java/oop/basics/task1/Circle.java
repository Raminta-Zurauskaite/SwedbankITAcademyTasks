package com.itacademy.java.oop.basics.task1;

public class Circle extends Shape{
    protected double fieldRadius;

    public Circle(double fieldRadius) {
        this.fieldRadius = fieldRadius;
    }

    @Override
    double calculateArea(double fieldRadius) {
        //Area of a circle = π * r2
        return fieldRadius*fieldRadius*Math.PI;
    }

    @Override
    double calculatePerimeter(double fieldRadius) {
        //C = 2πR = πD
        return fieldRadius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Square{" +
                "fieldSide=" + fieldRadius +
                '}' + "Its area is " +
                calculateArea(fieldRadius) + " and its perimeter is "
                + calculatePerimeter(fieldRadius);
    }
}
