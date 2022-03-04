package com.itacademy.java.oop.basics;

public class Square {
    private double length;
    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public String isShapeValid() {
        if (this.length > 0 && this.width > 0) {
            return "Shape is valid, its area is " + this.length * this.width + " and its perimeter is " + (this.length + this.width) * 2;
        }
        return "Shape is not valid.";
    }
}
