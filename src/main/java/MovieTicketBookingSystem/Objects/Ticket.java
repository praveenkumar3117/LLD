package MovieTicketBookingSystem.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {
    private int ticketId;
    private int showId;
    private int userId;
    private int noOfSeats;
    private String bookingStatus;
}
