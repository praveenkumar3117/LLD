package MovieTicketBookingSystem.Services;

import MovieTicketBookingSystem.Observable.ShowPublisher;
import MovieTicketBookingSystem.Objects.Show;

import java.util.ArrayList;
import java.util.List;

public class ShowService {
    private static List<Show> showList = new ArrayList<>();
    public static void addShow(Show show)
    {
        showList.add(show);
        ShowPublisher.notifyObservers(show);
        TicketBooking.initialiseShowSeats(show);
    }
}
