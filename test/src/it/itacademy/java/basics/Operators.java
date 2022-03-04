package it.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        task5();
        task6();

    }
    private static void task5(){
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter triangle first side");
        int triangle1 = Integer.parseInt(triangle.nextLine());  // Read user input
        System.out.println("Enter triangle second side");
        int triangle2 = Integer.parseInt(triangle.nextLine());  // Read user input
        System.out.println("Enter triangle third side");
        int triangle3 = Integer.parseInt(triangle.nextLine());  // Read user input
        if (((triangle1+triangle2)>triangle3) && ((triangle1+triangle3)>triangle2) && ((triangle2+triangle3)>triangle1)){
            if (triangle1 == triangle2 && triangle2 == triangle3){
                System.out.println("Triangle is Equilateral. Sides: " + triangle1 + " " + triangle2 + " " + triangle3);
            }
            else if (triangle1 == triangle2 || triangle2 == triangle3 || triangle1 == triangle3){
                System.out.println("Triangle is Isosceles. Sides: " + triangle1 + " " + triangle2 + " " + triangle3);
            }
            else{
                System.out.println("Triangle is Scalene. Sides: " + triangle1 + " " + triangle2 + " " + triangle3);
            }
        }
        else{
            System.out.println("Triangle is invalid. Sides: " + triangle1 + " " + triangle2 + " " + triangle3);
        }
    }

    private static void task6(){
        Scanner car = new Scanner(System.in);
        System.out.println("Enter distance to destination");
        double distanceToDestination = Double.parseDouble(car.nextLine());  // Read user input
        System.out.println("Enter fuel left");
        double fuelLeft = Double.parseDouble(car.nextLine());  // Read user input
        System.out.println("Enter fuel usage per 100km");
        double fuelUsage = Double.parseDouble(car.nextLine());  // Read user input
        System.out.println("Enter fuel price per liter");
        double fuelPricePerLiter = Double.parseDouble(car.nextLine());  // Read user input
        if (fuelLeft >= distanceToDestination*fuelUsage/100){
            System.out.println("Destination is in " + distanceToDestination + " km. Car is able to reach the destination. It will have " + (fuelLeft-(distanceToDestination*fuelUsage/100)) +  " liters of fuel left.");
        }
        else{
            System.out.println("Destination is in " + distanceToDestination + "km. Car is not able to reach the destination. It needs " + ((distanceToDestination*fuelUsage/100)-fuelLeft) + " liter of fuel more. It will cost " + fuelPricePerLiter*((distanceToDestination*fuelUsage/100)-fuelLeft));
        }
    }
}
