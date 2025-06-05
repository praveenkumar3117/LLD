package MovieTicketBookingSystem.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show {
    private int showId;
    private int movieId;
    private int cinemaId;
    private int startTime;
    private int endTime;
    public Show(int showId, int movieId , int cinemaId, int startTime, int endTime)
    {
        this.showId=showId;
        this.cinemaId=cinemaId;
        this.movieId=movieId;
        this.startTime=startTime;
        this.endTime=endTime;
    }
}
