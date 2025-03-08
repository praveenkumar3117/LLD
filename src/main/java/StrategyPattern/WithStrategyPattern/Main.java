package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class Main {

    public static void main (String[] args)
    {
        Vehicle vehicle = new NormalVehicle();
        vehicle.getModelName();
        vehicle.drive();

        vehicle = new SportsVehicle();
        vehicle.getModelName();
        vehicle.drive();

        vehicle = new OffRoadVehicle();
        vehicle.getModelName();
        vehicle.drive();

    }
}
