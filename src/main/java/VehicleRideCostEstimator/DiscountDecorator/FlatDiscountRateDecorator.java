package VehicleRideCostEstimator.DiscountDecorator;

import VehicleRideCostEstimator.RateStrategy.RateStrategy;
import VehicleRideCostEstimator.Vehicle.Vehicle;

public class FlatDiscountRateDecorator extends RateStrategyDecorator {

    private final RateStrategy rateStrategy;
    private final double discount;
    public FlatDiscountRateDecorator(RateStrategy rateStrategy, double discount)
    {
        this.rateStrategy=rateStrategy;
        this.discount=discount;
    }

    @Override
    public double calculateFare(Vehicle vehicle, double km, double min) {
        double fare =rateStrategy.calculateFare(vehicle,km,min) -discount;
        return Math.max(0,fare);
    }
}
