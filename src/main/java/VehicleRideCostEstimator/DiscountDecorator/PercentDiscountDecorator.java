package VehicleRideCostEstimator.DiscountDecorator;

import VehicleRideCostEstimator.RateStrategy.RateStrategy;
import VehicleRideCostEstimator.Vehicle.Vehicle;

public class PercentDiscountDecorator extends RateStrategyDecorator {

    private final RateStrategy rateStrategy;
    private final double discountPercent;

    public PercentDiscountDecorator(RateStrategy rateStrategy, double discountPercent)
    {
        this.rateStrategy=rateStrategy;
        this.discountPercent=discountPercent;
    }

    @Override
    public double calculateFare(Vehicle vehicle, double km, double min) {
        return ((100-discountPercent) * rateStrategy.calculateFare(vehicle, km , min))/100;
    }
}
