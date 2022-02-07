package com.example.BookMyShow;

import com.example.BookMyShow.controller.MovieController;
import com.example.BookMyShow.controller.TheatreController;
import com.example.BookMyShow.enums.SeatType;
import com.example.BookMyShow.model.City;
import com.example.BookMyShow.model.Theatre;
import com.example.BookMyShow.service.MovieService;
import com.example.BookMyShow.service.TheatreService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BaseSetup {

    TheatreController theatreController;
    MovieController movieController;

    @Test
    void testInfra(){

        setupControllers();

        List<City> cities = theatreController.getCities();

        Assert.assertEquals(theatreController.getCities().size(), 1);

        for(City city:cities){
            Assert.assertEquals(city.getTheatres().size(), 1);
            for(Theatre theatre:city.getTheatres()){
                Assert.assertEquals(theatre.getHalls().size(), 2);
                Assert.assertEquals(theatre.getHalls().get(0).getSeats().size(), 20);
                Assert.assertEquals(theatre.getHalls().get(1).getSeats().size(), 30);
            }
        }
    }

    String setupControllers(){
        final TheatreService theatreService = new TheatreService();
        final MovieService movieService = new MovieService();
        theatreController = new TheatreController(theatreService);
        movieController = new MovieController(movieService);
        return infraSetup();
    }

    String infraSetup(){
        String cityId = theatreController.createCity("Faridabad");
        String theatreId = theatreController.createTheatre("SRS", cityId);
        String hall1ID = theatreController.createHall("Screen1", theatreId);
        String hall2ID = theatreController.createHall("Screen2", theatreId);

        //Adding seats to hall1
        createSeatsInHall(10, SeatType.SILVER, hall1ID, "A");
        createSeatsInHall(10, SeatType.GOLD, hall1ID, "B");

        //Adding seats to hall2
        createSeatsInHall(10, SeatType.SILVER, hall2ID, "A");
        createSeatsInHall(10, SeatType.GOLD, hall2ID, "B");
        createSeatsInHall(10, SeatType.SOFA, hall2ID, "C");

        return cityId;

    }

    void createSeatsInHall(int seats, SeatType seatType, String hallId, String row){
        for(int i = 1; i<= seats; i++){
            theatreController.createSeat(row+i, seatType, hallId);
        }
    }

}
