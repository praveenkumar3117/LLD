package MovieTicketBookingSystem;

import MovieTicketBookingSystem.Objects.CinemaHall;
import MovieTicketBookingSystem.Objects.Show;
import MovieTicketBookingSystem.Observable.ShowPublisher;
import MovieTicketBookingSystem.Observer.SearchByMovieInCity;
import MovieTicketBookingSystem.Observer.SearchShowsByMovieInCinema;
import MovieTicketBookingSystem.Observer.ShowObserver;
import MovieTicketBookingSystem.Services.CinemaService;
import MovieTicketBookingSystem.Services.ShowService;
import MovieTicketBookingSystem.Services.TicketBooking;

import java.util.List;

public class Main {

    public static void main(String [] args)
    {
        ShowObserver showObserver = new SearchByMovieInCity();
        ShowObserver showObserver1 = new SearchShowsByMovieInCinema();
        ShowPublisher.addObserver(showObserver);
        ShowPublisher.addObserver(showObserver1);
        CinemaHall cinemaHall = new CinemaHall(1,45,50);
        CinemaService.addCinemaHall(cinemaHall);
        Show show = new Show(23,245,1,123,1234);
        ShowService.addShow(show);
        List<Show> showList = showObserver.search(45,245);

        for (Show s: showList)
        {
            System.out.println("This is showID0 " +  s.getShowId());
            System.out.println("This is startTime0 "+ s.getStartTime());
        }

        List<Show> showList1 = showObserver1.search(1,245);

        for (Show s: showList1)
        {
            System.out.println("This is showID " +  s.getShowId());
            System.out.println("This is startTime "+ s.getStartTime());
        }

        System.out.println(TicketBooking.BookTicket(23,6,321));
        System.out.println("Tickets available for show " + TicketBooking.getAvailableSeatsForAShow(23));
        System.out.println(TicketBooking.BookTicket(23,44,321));
        System.out.println("Tickets available for show " + TicketBooking.getAvailableSeatsForAShow(23));
        System.out.println(TicketBooking.BookTicket(23,1,321));
    }
}
