package MovieTicketBookingSystem.Services;

import MovieTicketBookingSystem.Objects.CinemaHall;

import java.util.ArrayList;
import java.util.List;

public class CinemaService {
    private static List<CinemaHall> cinemaHalls= new ArrayList<>();
    public static void addCinemaHall(CinemaHall cinemaHall)
    {
        cinemaHalls.add(cinemaHall);
    }

    public static int getCityIdByCinemaId(int cinemaId)
    {
        for(CinemaHall hall : cinemaHalls)
        {
            if(hall.getCinemaId()==cinemaId)
            {
                return hall.getCityId();
            }
        }
        return -1;
    }

    public static int getCinemaCapacity(int cinemaId)
    {
        for(CinemaHall hall : cinemaHalls)
        {
            if(hall.getCinemaId()==cinemaId)
            {
                return hall.getCapacity();
            }
        }
        return 0;
    }
}
