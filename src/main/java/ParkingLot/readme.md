This is a Parking Lot Management System implemented in Java. The system allows for the parking and unparking of vehicles, tracking slot occupancy, and managing parking ticket generation.
The design uses object-oriented principles, and the system is designed to handle multiple floors and slots per floor.


This is a Parking Lot Management System implemented in Java. The system allows for the parking and unparking of vehicles, tracking slot occupancy, and managing parking ticket generation. The design uses object-oriented principles, and the system is designed to handle multiple floors and slots per floor.

Features
1. Parking and Unparking Vehicles
   Vehicles can be parked into available slots, with a parking ticket being generated upon successful parking.

Vehicles can be unparked by providing the parking ticket.

When a vehicle is unparked, the corresponding slot is marked as free again.

2. Slot Occupancy Management
   The system tracks slot occupancy. A slot can be either free or occupied.

When a vehicle is parked, the slot is marked as occupied.

When a vehicle is unparked, the slot is marked as free.

3. Parking Ticket Generation
   A parking ticket is generated when a vehicle is successfully parked.

The ticket contains the parking lot ID, floor number, and slot number, allowing the user to identify the parked vehicle's location.

4. Displaying Slot Availability
   The system can display available (free) and occupied slots for each floor or for the entire parking lot.

Users can query the system to view free or occupied slots at any given time.

5. Find Slot by Vehicle Registration Number
   The system provides functionality to find a parked vehicle’s location (floor and slot) based on the vehicle's registration number.

A hash map is used to quickly map registration numbers to their respective parking slots.

6. Multi-Floor Parking Lot
   The system supports parking lots with multiple floors and multiple slots per floor.

Users can choose to view the availability of slots for a particular floor or across the entire parking lot.

7. Dynamic Slot Assignment
   The system dynamically assigns available slots to vehicles, ensuring that vehicles are parked in the first available slot.

Once a vehicle is parked, the slot is marked as occupied, and the vehicle’s registration number is mapped to the slot.

Design
Parking Lot Class
The ParkingLot class holds the main properties like parking lot ID, number of floors, and number of slots per floor.

It uses a map to manage the slots and a hash map (registrationSlotMapping) for quick lookups of parked vehicles by their registration number.

HandleParking Class
This class contains utility functions to park and unpark vehicles, manage slot occupancy, and generate tickets.

The methods in this class are primarily static to allow utility-style usage without needing to instantiate the class.

Slot Class
Represents a parking slot in the parking lot. Each slot contains information about whether it's occupied, which vehicle is parked, and the floor and slot numbers.

Vehicle Class
Represents a vehicle with properties like registration number and color.

TicketUtil Class
Contains the logic to generate a unique ticket ID for each vehicle parked.





Future Enhancements
Pricing Calculation: Implement dynamic pricing for parking based on time spent in the parking lot.

Vehicle Type Support: Extend functionality to support different types of vehicles (e.g., motorcycles, trucks).

Multiple Vehicle Support: Allow multiple vehicles to park in a single slot for certain vehicle types (e.g., compact cars, motorcycles).

Parking Time Tracking: Track the time a vehicle has been parked and show it in the ticket or use it for billing purposes.

API Integration: Expose the parking lot functionality as a REST API for integration with mobile apps or websites.

User Authentication: Add user authentication to allow different users to park/unpark vehicles and manage their own slots.

