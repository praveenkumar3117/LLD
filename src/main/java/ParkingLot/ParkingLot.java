package ParkingLot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public class ParkingLot {
    private String parkingLotid;
    private int noOfFloors;
    private int noOfSlotsPerFloor;
    Map<Integer, List<Slot>> parking = new HashMap<>();
    Map<String,Slot> registrationSlotMapping= new HashMap<>();
    ParkingLot(String parkingLotid, int noOfFloors, int noOfSlotsPerFloor)
    {
        this.parkingLotid=parkingLotid;
        this.noOfFloors=noOfFloors;
        this.noOfSlotsPerFloor=noOfSlotsPerFloor;
        for(int i=0;i<noOfFloors;i++)
        {
            parking.put(i, new ArrayList<>());
            for(int j=0;j<noOfSlotsPerFloor;j++)
            {
                parking.get(i).add(new Slot(false,i+1,j+1));
            }
        }
    }

    public String parkVehicle(Vehicle vehicle)
    {
        return HandleParking.parkVehicle(vehicle,this);
    }

    public String unparkVehicle(String ticketId)
    {
        return HandleParking.unparkVehicle(ticketId,this);
    }

    public void displayFreeSlots()
    {
        HandleParking.displayFreeSlots(this);
    }

    public void displayOccupiedSlots()
    {
        HandleParking.displayOccupiedSlots(this);
    }

    public void displayFreeSlots(int floorNo)
    {
        HandleParking.displayFreeSlots(this, floorNo);
    }

    public void displayOccupiedSlots(int floorNo)
    {
        HandleParking.displayOccupiedSlots(this,floorNo);
    }

    public void displaySlotsByOccupancy(boolean occupied)
    {
        HandleParking.displaySlotsByOccupancy(this, occupied);
    }

    public void displaySlotsByOccupancy(int floorNo, boolean occupied)
    {
        HandleParking.displaySlotsByOccupancy(this,floorNo,occupied);
    }

    public String findSlotByRegistrationNo(String registrationNo)
    {
        return HandleParking.findSlotByRegistrationNo(this,registrationNo);
    }
}