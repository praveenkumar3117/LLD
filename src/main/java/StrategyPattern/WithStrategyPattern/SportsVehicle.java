package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle()
    {
        super(new SportsDriveStrategy());
    }

    @Override
    public void getModelName() {
        System.out.println("This is sports car");
    }
}
