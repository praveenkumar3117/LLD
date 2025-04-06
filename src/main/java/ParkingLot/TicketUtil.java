package ParkingLot;

public class TicketUtil {
    public static String generateTicket(String parkingLotId, int floor, int slot)
    {
        return parkingLotId + "_" + floor + "_" + slot;
    }
}
