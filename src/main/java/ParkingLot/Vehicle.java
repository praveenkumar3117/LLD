package ParkingLot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    private String type;
    private String registrationNo;
    private String color;
    Vehicle(String type, String registrationNo, String color)
    {
        this.type=type;
        this.registrationNo=registrationNo;
        this.color=color;
    }
}
