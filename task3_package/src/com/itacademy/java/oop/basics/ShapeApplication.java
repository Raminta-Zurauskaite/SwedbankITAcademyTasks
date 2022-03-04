package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square1 = new Square(4.5, 5);
        Square square2 = new Square(213, 0);
        Square square3 = new Square(-23, 5);
        Square square4 = new Square(4.5, -2);
        Square square5 = new Square(-213, -1231);

        Square[] squares = {square1, square2, square3, square4, square5};

        System.out.println(Arrays.toString(squares));

        Square x;
        for (int i = 0; i < squares.length; i++) {
            x = squares[i];
            System.out.println(squares[i].isShapeValid());
        }
        //System.out.println(square1.isShapeValid());
    }
}
