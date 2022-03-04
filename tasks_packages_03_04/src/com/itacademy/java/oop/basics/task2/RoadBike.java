package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;
    private int maximumSpeed = 50;

    @Override
    public void changeGear(int newGear) {

    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            System.out.println("Given number is negative, please use positive numbers");
        } else if ((speed + increment) > maximumSpeed) {
            System.out.println("Speed up is too high, use " + (maximumSpeed - speed) + " instead.");
        } else {
            speed += increment;
            System.out.println("New speed of road bike is " + speed + ".");
        }
    }

    @Override
    public void applyBrakes(int breakingValue) {

    }
}
