package oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;
    private int maximumSpeed = 50;
    private int maximumGear = 10;

    @Override
    public void changeGear(int newGear) {
        if (newGear != -1 && newGear != 1 && newGear != -2 && newGear != 2) {
            System.out.println("Suggested gear value is not allowed, please use -1, 1, 2 or -2 instead.");
        } else if ((newGear == 1 && gear < maximumGear) || (newGear == 2 && (gear - 1) < maximumGear)) {
            gear = gear + newGear;
            System.out.println("New gear is " + gear);
        } else if (newGear == -1 && gear > 0) {
            gear--;
            System.out.println("New gear is " + gear);
        } else if (newGear == -1 && gear <= 0) {
            System.out.println("Gear is below 0.");
        } else if ((newGear == 1 && gear >= maximumGear) || (newGear == 2 && (gear + 1) >= maximumGear)) {
            System.out.println("Gear is already at max 20.");
        }
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
        if (breakingValue > 0) {
            System.out.println("Breaking value is positive, use negatives numbers.");
        } else if ((speed - breakingValue) < 0) {
            System.out.println("Breaking value is too high, recommend using " + speed + " instead.");
        } else {
            speed -= breakingValue;
            System.out.println("New speed is " + speed + ".");
        }

    }
}
