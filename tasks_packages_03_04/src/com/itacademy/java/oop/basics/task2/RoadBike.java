package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    protected int gear;
    protected int speed;

    @Override
    public void changeGear(int newGear) {

    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            System.out.println("Given number is negative, please use positive numbers");
        } else if ((speed + increment) > 100) {
            System.out.println("Speed up is too high, use " + (100 - speed) + " instead.");
        } else {
            speed += increment;
            System.out.println("New speed of mountain bike is " + speed + ".");
        }
    }

    @Override
    public void applyBrakes(int breakingValue) {

    }
}
