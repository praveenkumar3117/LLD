package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle ()
    {
        super(new SportsDriveStrategy());
    }

    @Override
    public void getModelName() {
        System.out.println("This is a offroad vehicle");
    }
}
