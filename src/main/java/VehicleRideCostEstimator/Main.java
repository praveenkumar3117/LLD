package VehicleRideCostEstimator;

import VehicleRideCostEstimator.DiscountDecorator.FlatDiscountRateDecorator;
import VehicleRideCostEstimator.DiscountDecorator.PercentDiscountDecorator;
import VehicleRideCostEstimator.RateStrategy.NightRate;
import VehicleRideCostEstimator.RateStrategy.PeakHourRate;
import VehicleRideCostEstimator.RateStrategy.RateStrategy;
import VehicleRideCostEstimator.Ride.Ride;
import VehicleRideCostEstimator.Utils.CreateRide;
import VehicleRideCostEstimator.Vehicle.Vehicle;
import VehicleRideCostEstimator.VehicleFactory.VehicleFactory;

import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        //Vehicle vehicle = new Car();
        //Vehicle vehicle1 = new Bike();
        Scanner scanner = new Scanner(System.in);


        RateStrategy rateStrategy = new PeakHourRate(2);
        RateStrategy discounted = new FlatDiscountRateDecorator(rateStrategy,100);
        Ride ride = CreateRide.createRide(scanner);
        assert ride != null;
        ride.setRateStrategy(rateStrategy);
        //rateStrategy= new DiscountRateDecorator(rateStrategy,100);
        System.out.println(ride.calculateFare());
        //ride = new Ride(vehicle1,10,5,rateStrategy);
        //System.out.println(ride.calculateFare());


        RateStrategy rateStrategy1 = new NightRate();
        RateStrategy percentDiscount = new PercentDiscountDecorator(rateStrategy1, 50);
        ride.setRateStrategy(percentDiscount);
        System.out.println(ride.calculateFare());
    }
}
