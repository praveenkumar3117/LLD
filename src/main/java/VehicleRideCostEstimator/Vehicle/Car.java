package VehicleRideCostEstimator.Vehicle;

public class Car implements Vehicle {
    @Override
    public double getBaseRatePerKm() {
        return 15;
    }

    @Override
    public double getBaseRatePerMin() {
        return 10;
    }
}
