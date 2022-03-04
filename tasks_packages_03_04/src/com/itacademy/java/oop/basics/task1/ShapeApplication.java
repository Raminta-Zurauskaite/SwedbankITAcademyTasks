package com.itacademy.java.oop.basics.task1;

public class ShapeApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(5);
        System.out.println(square.toString());
        System.out.println(circle.toString());
    }
}
