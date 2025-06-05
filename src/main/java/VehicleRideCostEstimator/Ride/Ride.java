package VehicleRideCostEstimator.Ride;

import VehicleRideCostEstimator.RateStrategy.RateStrategy;
import VehicleRideCostEstimator.Vehicle.Vehicle;
import lombok.Setter;

public class Ride {
    private final Vehicle vehicle;
    private final double distanceTravelled;
    private final double minutesTravelled;
    @Setter
    private RateStrategy rateStrategy;
    public Ride(Vehicle vehicle, double distance, double min, RateStrategy rateStrategy)
    {
        this.vehicle=vehicle;
        this.distanceTravelled=distance;
        this.minutesTravelled=min;
        this.rateStrategy=rateStrategy;
    }

    public double calculateFare()
    {
        return rateStrategy.calculateFare(vehicle, distanceTravelled, minutesTravelled);
    }



}
