package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;
import StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{

    NormalVehicle ()
    {
        super(new NormalDriveStrategy());
    }

    @Override
    public void getModelName() {
        System.out.println("This is a normal car");
    }
}
