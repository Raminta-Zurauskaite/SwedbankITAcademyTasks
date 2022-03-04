package it.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){

        task1();
        task2();
    }

    private static void task1(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = myObj.nextLine();  // Read user input
        System.out.println("Enter last name");
        String lastName = myObj.nextLine();  // Read user input
        System.out.println("Enter age");
        int userAge = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Hello I am " + firstName + " " + lastName + " age " + userAge + ". I am attending IT Academy 2020!");  // Output user input

    }

    private static void task2() {
        char value1 = 'H';
        short value2 = 3110;
        char value3 = 'w';
        byte value4 = 0;
        char value5 = 'r';
        int value6 = 1;
        char value7 = 'd';
        float value8 = 2.0F;
        boolean value9 = true;
        String value10 = String.valueOf(value1) + value2 + " " + value3 + value4 + value5 + value6 + value7 + " " + value8 + " " + value9;
        System.out.println(value10);
    }
}
