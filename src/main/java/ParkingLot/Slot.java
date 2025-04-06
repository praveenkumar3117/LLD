package ParkingLot;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Slot {
    private boolean isOccupied;
    private Vehicle parkedVehicle;
    private int floorNo;
    private int slotNo;
    Slot(boolean isOccupied,int floorNo,int slotNo)
    {
        this.isOccupied=isOccupied;
        this.slotNo=slotNo;
        this.floorNo=floorNo;

    }
}
