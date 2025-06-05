package MovieTicketBookingSystem.Observer;

import MovieTicketBookingSystem.Objects.Show;

import java.util.List;

public interface ShowObserver {
    void onShowAdded(Show show);
    List<Show> search(int id, int movieId);
}
