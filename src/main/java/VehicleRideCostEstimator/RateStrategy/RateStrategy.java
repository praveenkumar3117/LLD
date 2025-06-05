package VehicleRideCostEstimator.RateStrategy;

import VehicleRideCostEstimator.Vehicle.Vehicle;

public interface RateStrategy {
    double calculateFare(Vehicle vehicle, double km, double min);
}
