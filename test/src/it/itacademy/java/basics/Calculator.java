package it.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        task10();
    }

    private static void task10(){
        boolean cont = true;
        while (cont){
            Scanner calculator = new Scanner(System.in);
            System.out.println("Enter the form you want to calculate (Rectangle, Square or Triangle)");
            String form = calculator.nextLine();
            switch (form){
                case "Triangle":
                    System.out.println("Enter first side of the triangle.");
                    String side1 = calculator.nextLine();
                    try {
                        Integer.parseInt(side1);
                    }
                    catch (NumberFormatException e){
                        System.out.println(side1 + " is not a valid integer.");
                        break;
                    }
                    System.out.println("Enter second side of the triangle.");
                    String side2 = calculator.nextLine();
                    try {
                        Integer.parseInt(side2);
                    }
                    catch (NumberFormatException e){
                        System.out.println(side2 + " is not a valid integer.");
                        break;
                    }
                    System.out.println("Enter third side of the triangle.");
                    String side3 = calculator.nextLine();
                    try {
                        Integer.parseInt(side3);
                        int tSide1 = Integer.parseInt(side1);
                        int tSide2 = Integer.parseInt(side2);
                        int tSide3 = Integer.parseInt(side3);
                        int tPerimeter = tSide1 + tSide2 + tSide3;
                        double tArea = Math.sqrt((tPerimeter/2)*((tPerimeter/2) - tSide1)*(tPerimeter/2 - tSide2)*(tPerimeter/2 - tSide3));
                        System.out.println(form + " perimeter is " + tPerimeter + " and area is " + tArea + ".");
                    }
                    catch (NumberFormatException e){
                        System.out.println(side3 + " is not a valid integer.");
                    }
                    break;
                case "Square":
                    System.out.println("Enter length of the square.");
                    String sSide = calculator.nextLine();
                    try {
                        Integer.parseInt(sSide);
                        System.out.println(form + " perimeter is " + Integer.parseInt(sSide)*4 + " and area is " + Integer.parseInt(sSide)*Integer.parseInt(sSide) + ".");
                    }
                    catch (NumberFormatException e){
                        System.out.println(sSide + " is not a valid integer.");
                    }
                    break;
                case "Rectangle":
                    System.out.println("Enter first side of the square.");
                    String side01 = calculator.nextLine();
                    try {
                        Integer.parseInt(side01);
                    }
                    catch (NumberFormatException e){
                        System.out.println(side01 + " is not a valid integer.");
                        break;
                    }
                    System.out.println("Enter second side of the square.");
                    String side02 = calculator.nextLine();
                    try {
                        Integer.parseInt(side02);
                        System.out.println(form + " perimeter is " + (Integer.parseInt(side01)+Integer.parseInt(side02))*2 + " and area is " + Integer.parseInt(side01)*Integer.parseInt(side02) + ".");
                    }
                    catch (NumberFormatException e){
                        System.out.println(side02 + " is not a valid integer.");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Make sure it says the full word with a capital.");
                }

            System.out.println("Do you want to repeat the program? (y/n)");
            String contin = calculator.nextLine();
            if (contin.equals("n") || contin.equals("N") || contin.equals("No") || contin.equals("NO") || contin.equals("no")) {
                cont = false;
            }
        }
    }
}
