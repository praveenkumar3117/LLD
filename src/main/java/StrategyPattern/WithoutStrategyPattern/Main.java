package StrategyPattern.WithoutStrategyPattern;

import java.io.PrintStream;

public class Main {

    public static void main(String [] args)
    {
        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.Drive();
        NormalVehicle normalVehicle = new NormalVehicle();
        normalVehicle.Drive();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.Drive();
    }
}
