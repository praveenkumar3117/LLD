package MovieTicketBookingSystem.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaHall {
    private int cinemaId;
    private int cityId;
    private int capacity;
    public CinemaHall(int cinemaId, int cityId, int capacity)
    {
        this.cinemaId=cinemaId;
        this.cityId=cityId;
        this.capacity=capacity;
    }
}
