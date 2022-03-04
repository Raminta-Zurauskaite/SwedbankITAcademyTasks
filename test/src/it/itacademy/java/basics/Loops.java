package it.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        //task7();
        //task8();
        task9();
    }

    private static void task7(){
        Scanner hoursAndMinutes = new Scanner(System.in);
        System.out.println("Enter days in a year");
        int days = Integer.parseInt(hoursAndMinutes.nextLine());  // Read user input
        int hours = 0;
        int minutes = 0;
        for (int i = 0; i < days; i++){
            hours = hours + 24;
            minutes = minutes + (24*60);
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    private static void task8(){
        Scanner hoursAndMinutes2 = new Scanner(System.in);
        System.out.println("Enter days in a year");
        int days = Integer.parseInt(hoursAndMinutes2.nextLine());  // Read user input
        int hours = 0;
        int minutes = 0;
        int i = 0;
        while (i < days){
            hours = hours + 24;
            minutes = minutes + (24*60);
            i++;
        }
        System.out.println("There are " + hours + " hours or " + minutes + " minutes in one year.");
    }

    private static void task9(){
        Scanner factorial = new Scanner(System.in);
        System.out.println("Enter integer you want the factorial of");
        int number = Integer.parseInt(factorial.nextLine());
        int result = 1;
        for (int i = number; i > 1; i--){
            result = result * i;
        }
        System.out.println(result);
    }
}
