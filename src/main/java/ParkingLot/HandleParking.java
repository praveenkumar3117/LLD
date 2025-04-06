package ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HandleParking {

    public static String parkVehicle(Vehicle vehicle, ParkingLot parkingLot)
    {
        for(int i=0;i<parkingLot.getNoOfFloors();i++)
        {
            List<Slot> floor =parkingLot.parking.get(i);
            for(int j=0;j<floor.size();j++)
            {
                if(!floor.get(j).isOccupied())
                {
                    System.out.println("Slot " +(j+1)+ " availbale on floor " +(i+1));
                    System.out.println("Parking.....");
                    floor.get(j).setOccupied(true);
                    floor.get(j).setParkedVehicle(vehicle);
                    System.out.println(" re " + vehicle.getRegistrationNo() + " "+ floor.get(j).getFloorNo());
                    parkingLot.registrationSlotMapping.put(vehicle.getRegistrationNo(),floor.get(j));
                    System.out.println("Vehicle parked");
                    return TicketUtil.generateTicket(parkingLot.getParkingLotid(),i+1,j+1);
                }

            }
        }
        return "Parking Lot Full";
    }


    public static String unparkVehicle(String ticketId,ParkingLot parkingLot)
    {

        String [] ticketArray = ticketId.split("_");
        if(ticketArray.length!=3) return "Invalid Ticket";

        String parkingLotId= ticketArray[0];
        int floorNo;
        int slotNo;
        try {
            floorNo= Integer.parseInt(ticketArray[1]);
            slotNo= Integer.parseInt(ticketArray[2]);
        }
        catch (NumberFormatException e)
        {
            return "Invalid floor or slot number in ticket";
        }
        if(!Objects.equals(parkingLotId, parkingLot.getParkingLotid()))
        {
            return "ParkingId doesn't match with ticket";
        }
        Slot slot = parkingLot.parking.get(floorNo-1).get(slotNo-1);
        if(!slot.isOccupied())
        {
            return "Invalid ticket, slot is empty already";
        }

        String vehicleRegistrationNo= slot.getParkedVehicle().getRegistrationNo();
        String vehicleColor = slot.getParkedVehicle().getColor();
        slot.setParkedVehicle(null);
        slot.setOccupied(false);
        parkingLot.registrationSlotMapping.remove(vehicleRegistrationNo);
        return "Unparked vehicle with registration number "+ vehicleRegistrationNo  + " and color: "+ vehicleColor;
    }
    public static void displayFreeSlots(ParkingLot parkingLot)
    {
        for(int i=0;i<parkingLot.getNoOfFloors();i++)
        {
            List<Integer> freeSlots= new ArrayList<>();
            for(int j=0;j<parkingLot.getNoOfSlotsPerFloor();j++)
            {
                if(!parkingLot.getParking().get(i).get(j).isOccupied())
                {
                   freeSlots.add((j+1));
                }
            }
            System.out.println("Free slots on floor "+(i+1) + " :"+freeSlots);
        }
    }

    public static void displayOccupiedSlots(ParkingLot parkingLot)
    {
        for(int i=0;i<parkingLot.getNoOfFloors();i++)
        {
            List<Integer> occupiedSlots= new ArrayList<>();
            for(int j=0;j<parkingLot.getNoOfSlotsPerFloor();j++)
            {
                if(parkingLot.getParking().get(i).get(j).isOccupied())
                {
                    occupiedSlots.add((j+1));
                }
            }
            System.out.println("Occupied slots on floor "+(i+1) + " :"+occupiedSlots);
        }
    }

    public static void displayFreeSlots(ParkingLot parkingLot, int floorNo)
    {
        if(floorNo > parkingLot.getNoOfFloors() || floorNo<1)
        {
            System.out.println("Floor doesn't exists ");
            return;
        }
        List<Integer> freeSlots= new ArrayList<>();
        for(int j=0;j<parkingLot.getNoOfSlotsPerFloor();j++)
        {
            if(!parkingLot.getParking().get(floorNo-1).get(j).isOccupied())
            {
                freeSlots.add((j+1));
            }
        }
        System.out.println("Free slots on floor "+(floorNo) + " :"+freeSlots);
    }

    public static void displayOccupiedSlots(ParkingLot parkingLot, int floorNo)
    {
        if(floorNo > parkingLot.getNoOfFloors() || floorNo<1)
        {
            System.out.println("Floor doesn't exists ");
            return;
        }
        List<Integer> occupiedSlots= new ArrayList<>();
        for(int j=0;j<parkingLot.getNoOfSlotsPerFloor();j++)
        {
            if(parkingLot.getParking().get(floorNo-1).get(j).isOccupied())
            {
                occupiedSlots.add((j+1));
            }
        }
        System.out.println("Occupied slots on floor "+(floorNo) + " :"+occupiedSlots);
    }


    public static void displaySlotsByOccupancy(ParkingLot parkingLot,boolean occupied)
    {

        String status = occupied ? "Occupied":"Free";
        for(int i=0;i<parkingLot.getNoOfFloors();i++)
        {
            List<Integer> slots= new ArrayList<>();
            for(int j=0;j<parkingLot.getNoOfSlotsPerFloor();j++)
            {
                if(parkingLot.getParking().get(i).get(j).isOccupied()==occupied)
                {
                    slots.add((j+1));
                }
            }

            System.out.println(status+ " slots on floor "+(i+1) + " :"+slots);
        }
    }

    public static void displaySlotsByOccupancy(ParkingLot parkingLot, int floorNo,boolean occupied)
    {
        if(floorNo > parkingLot.getNoOfFloors() || floorNo<1)
        {
            System.out.println("Floor doesn't exists ");
            return;
        }
        String status = occupied ? "Occupied":"Free";
        List<Integer> slots= new ArrayList<>();
        for(int j=0;j<parkingLot.getNoOfSlotsPerFloor();j++)
        {
            if(parkingLot.getParking().get(floorNo-1).get(j).isOccupied()==occupied)
            {
                slots.add((j+1));
            }
        }

        System.out.println(status+ " slots on floor "+(floorNo) + " :"+slots);
    }

    public static String findSlotByRegistrationNo(ParkingLot parkingLot, String registrationNo)
    {
        if (registrationNo == null || registrationNo.trim().isEmpty()) {
            return "Registration number cannot be empty";
        }

        if(!parkingLot.registrationSlotMapping.containsKey(registrationNo))
        {
            return "Vehicle not found in any slot";
        }
        Slot slot = parkingLot.registrationSlotMapping.get(registrationNo);
        return "Vehicle with registration number " + registrationNo + " is parked at Floor "
                + slot.getFloorNo() + ", Slot " + slot.getSlotNo();
    }

}
