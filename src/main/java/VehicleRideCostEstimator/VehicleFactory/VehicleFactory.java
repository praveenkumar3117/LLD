package VehicleRideCostEstimator.VehicleFactory;


import VehicleRideCostEstimator.Vehicle.*;
import java.util.Objects;

public class VehicleFactory {

    public Vehicle createVehicle(String type)
    {
        if(Objects.equals(type, "Car")) return new Car();
        if(Objects.equals(type,"Bike")) return new Bike();
        return null;
    }
}
