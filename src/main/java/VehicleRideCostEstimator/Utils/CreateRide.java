package VehicleRideCostEstimator.Utils;

import VehicleRideCostEstimator.Ride.Ride;
import VehicleRideCostEstimator.Vehicle.Vehicle;
import VehicleRideCostEstimator.VehicleFactory.VehicleFactory;

import java.util.Scanner;

public class CreateRide {
    public static Ride createRide(Scanner scanner)
    {
        System.out.print("Enter vehicle type (car/bike): ");
        String vehicleType = scanner.next();

        System.out.print("Enter distance travelled (km): ");
        double distanceTravelled = scanner.nextDouble();

        System.out.print("Enter time travelled (minutes): ");
        double minutesTravelled = scanner.nextDouble();

        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.createVehicle(vehicleType);
        if(vehicle==null)
        {
            System.out.println("Invalid Vehicle Type");
            return null;
        }

        return new Ride(vehicle, distanceTravelled,minutesTravelled, null);
    }
}
