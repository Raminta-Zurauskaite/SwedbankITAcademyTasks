package oop.basics.task2;

public class Speedometer {
    static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        return Bike.road; //placeholder
    }

    static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed){
            return Bike.mountain;
        }
        else if (roadBikeSpeed > mountainBikeSpeed){
            return Bike.road;
        }
        else {

        }
        return Bike.road; //placeholder
    }
}
