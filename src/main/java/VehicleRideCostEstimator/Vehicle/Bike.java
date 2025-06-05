package VehicleRideCostEstimator.Vehicle;

public class Bike implements Vehicle {
    @Override
    public double getBaseRatePerKm() {
        return 10;
    }

    @Override
    public double getBaseRatePerMin() {
        return 5;
    }
}
