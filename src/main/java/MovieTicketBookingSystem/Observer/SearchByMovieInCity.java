package MovieTicketBookingSystem.Observer;

import MovieTicketBookingSystem.Services.CinemaService;
import MovieTicketBookingSystem.Objects.Show;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//search the shows in a city for a movie. With show you can get cinemas also
public class SearchByMovieInCity implements ShowObserver {
    private Map<Integer, List<Show>> cityToShows = new HashMap<>();


    @Override
    public void onShowAdded(Show show) {
        int cinemaId = show.getCinemaId();
        int cityId = CinemaService.getCityIdByCinemaId(cinemaId);
        cityToShows.putIfAbsent(cityId, new ArrayList<>());
        cityToShows.get(cityId).add(show);
    }

    @Override
    public List<Show> search(int cityId, int movieId)
    {
        List<Show> showList = new ArrayList<>();
        for(Show show: cityToShows.getOrDefault(cityId,new ArrayList<>()))
        {
            if(show.getMovieId()==movieId)
            {
                showList.add(show);
            }
        }
        return showList;
    }

}
