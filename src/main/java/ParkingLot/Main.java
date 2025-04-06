package ParkingLot;

public class Main {
    public static void main(String [] args)
    {
        //create a parking lot (parkingLotId, noOfFloors, noOfSlotsPerFloor)
        ParkingLot parkingLot = new ParkingLot("PR1234",3,4);

        //create a vehicle
        Vehicle vehicle = new Vehicle("Bike","HR35J1234","Blue");
        Vehicle vehicle1 = new Vehicle("Truck","HR35J123456","Black");
        Vehicle vehicle2 = new Vehicle("Car","HR35J001111","RED");
        System.out.println(parkingLot.parkVehicle(vehicle));
        System.out.println(parkingLot.parkVehicle(vehicle1));
        System.out.println(parkingLot.parkVehicle(vehicle2));
        System.out.println(parkingLot.unparkVehicle("PR1234_1_3"));
        System.out.println(parkingLot.parkVehicle(vehicle2));

        parkingLot.displayFreeSlots();
        parkingLot.displayOccupiedSlots();
        parkingLot.displayOccupiedSlots(2);
        parkingLot.displaySlotsByOccupancy(false);
        parkingLot.displaySlotsByOccupancy(1,true);
        parkingLot.displaySlotsByOccupancy(4,false);
        System.out.println(parkingLot.findSlotByRegistrationNo("HR35J1234"));
        System.out.println(parkingLot.findSlotByRegistrationNo("HR35J123456"));
        System.out.println(parkingLot.findSlotByRegistrationNo("HR35J001111"));
    }
}
