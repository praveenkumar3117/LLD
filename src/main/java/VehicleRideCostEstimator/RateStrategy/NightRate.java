package VehicleRideCostEstimator.RateStrategy;

import VehicleRideCostEstimator.Vehicle.Vehicle;

public class NightRate implements RateStrategy {
    @Override
    public double calculateFare(Vehicle vehicle, double km, double min) {
        return 1.25 * (vehicle.getBaseRatePerKm()*km + vehicle.getBaseRatePerMin()*min);
    }
}
