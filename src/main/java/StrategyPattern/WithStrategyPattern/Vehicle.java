package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy obj;

    //constructor-injection
    Vehicle(DriveStrategy obj)
    {
        this.obj=obj;
    }

    public void drive()
    {
        obj.drive();
    }

    public void getModelName()
    {
        System.out.println("This is a Alto car");
    }
}
