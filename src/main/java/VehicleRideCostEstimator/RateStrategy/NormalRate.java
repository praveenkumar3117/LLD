package VehicleRideCostEstimator.RateStrategy;

import VehicleRideCostEstimator.Vehicle.Vehicle;

public class NormalRate implements RateStrategy {
    @Override
    public double calculateFare(Vehicle vehicle, double km, double min) {
        return vehicle.getBaseRatePerKm()*km + vehicle.getBaseRatePerMin()*min;
    }
}
