package VehicleRideCostEstimator.RateStrategy;

import VehicleRideCostEstimator.Vehicle.Vehicle;

public class PeakHourRate implements RateStrategy {
    private final double surgeFactor;
    public PeakHourRate(double surgeFactor)
    {
        this.surgeFactor=surgeFactor;
    }
    @Override
    public double calculateFare(Vehicle vehicle, double km, double min) {
        return surgeFactor * (vehicle.getBaseRatePerKm()*km + vehicle.getBaseRatePerMin()*min);
    }
}
