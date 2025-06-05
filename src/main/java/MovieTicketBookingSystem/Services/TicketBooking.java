package MovieTicketBookingSystem.Services;

import MovieTicketBookingSystem.Objects.Show;
import MovieTicketBookingSystem.Objects.Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketBooking {
    private static int ticketCounter=1;
    private static Map<Integer, List<Ticket>> showIdToTicketsMapping = new HashMap<>();
    private static Map<Integer, Integer> showIdToAvailableSeats = new HashMap<>();

    public static String BookTicket(int showId, int ticketCount ,int userId)
    {
        int availableSeats=showIdToAvailableSeats.getOrDefault(showId,0);
        if(availableSeats>=ticketCount)
        {
            Ticket ticket = new Ticket();
            ticket.setTicketId(ticketCounter);
            ticket.setShowId(showId);
            ticket.setNoOfSeats(ticketCount);
            ticket.setUserId(userId);
            ticket.setBookingStatus("Booked");
            showIdToAvailableSeats.replace(showId,availableSeats-ticketCount);
            showIdToTicketsMapping.putIfAbsent(showId,new ArrayList<>());
            showIdToTicketsMapping.get(showId).add(ticket);
            return "Ticket Booked with ticket ID " + ticketCounter++ + " Enjoy";
        }
        else
        {
            return "Not enough seats available or show not available";
        }
    }

    public static void initialiseShowSeats(Show show)
    {
        System.out.println(CinemaService.getCinemaCapacity(show.getCinemaId()) + "seats added");
        showIdToAvailableSeats.put(show.getShowId(),CinemaService.getCinemaCapacity(show.getCinemaId()));
    }

    public static int getAvailableSeatsForAShow(int showId)
    {
        return showIdToAvailableSeats.getOrDefault(showId,0);
    }
}
