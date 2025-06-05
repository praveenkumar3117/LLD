package MovieTicketBookingSystem.Observable;

import MovieTicketBookingSystem.Observer.ShowObserver;
import MovieTicketBookingSystem.Objects.Show;

import java.util.ArrayList;
import java.util.List;

public class ShowPublisher {
    private static List<ShowObserver> observers = new ArrayList<>();

    public static void addObserver(ShowObserver showObserver)
    {
        observers.add(showObserver);
    }

    public static void notifyObservers(Show show)
    {
        for(ShowObserver showObserver: observers )
        {
            showObserver.onShowAdded(show);
        }
    }
}
