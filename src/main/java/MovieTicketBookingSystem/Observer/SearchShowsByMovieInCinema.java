package MovieTicketBookingSystem.Observer;

import MovieTicketBookingSystem.Objects.Show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



//Search the shows in a cinema for a particular movie
public class SearchShowsByMovieInCinema implements ShowObserver {
    private Map<Integer, List<Show>> cinemaToShows = new HashMap<>();

    @Override
    public void onShowAdded(Show show) {
        int cinemaId = show.getCinemaId();
        cinemaToShows.putIfAbsent(cinemaId,new ArrayList<>());
        cinemaToShows.get(cinemaId).add(show);

    }

    @Override
    public List<Show> search(int cinemaId, int movieId) {
        List<Show> showList = new ArrayList<>();
        for(Show show : cinemaToShows.getOrDefault(cinemaId,new ArrayList<>()))
        {
            if(show.getMovieId()==movieId)
            {
                showList.add(show);
            }
        }
        return showList;
    }
}
