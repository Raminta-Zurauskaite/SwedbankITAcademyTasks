package it.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    public static void main (String[] args){
        task3();
        task4();

    }

    private static void task3(){
        Scanner arit = new Scanner(System.in);
        System.out.println("Enter cube length");
        int length = Integer.parseInt(arit.nextLine());  // Read user input
        System.out.println("Cube's volume: " + length*length*length + "cm3.");
        System.out.println("Cube's perimeter: " + 12*length + "cm.");
    }
    private static void task4(){
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter feet");
        double feet = Double.parseDouble(convert.nextLine());  // Read user input
        System.out.println("Enter inches");
        double inches = Double.parseDouble(convert.nextLine());  // Read user input
        System.out.println(feet + " feet and " + inches + " inches = " + (feet*12*2.54+inches*2.54) + " cm");

    }
}
