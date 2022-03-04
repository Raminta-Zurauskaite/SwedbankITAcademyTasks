package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    protected int gear;
    protected int speed;

    @Override
    public void changeGear(int newGear) {
        if (newGear != -1 && newGear != 1) {
            System.out.println("Suggested gear value is not allowed, please use -1 or 1 instead.");
        } else if (newGear == 1 && gear < 20) {
            gear++;
            System.out.println("New gear is " + gear);
        } else if (newGear == -1 && gear > 0) {
            gear--;
        } else if (newGear == -1 && gear <= 0) {
            System.out.println("Gear is below 0.");
        } else if (newGear == 1 && gear >= 20) {
            System.out.println("Gear is already at max 20.");
        }

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
        if (breakingValue < 0) {
            System.out.println("Breaking value is negative, use positives numbers.");
        } else if ((speed - breakingValue) > -10) {
            System.out.println("Breaking value is too high, recommend using " + (breakingValue - (speed + 10)) + " instead.");
        } else {
            speed -= breakingValue;
            System.out.println("New speed is " + speed + ".");
        }

    }
}
