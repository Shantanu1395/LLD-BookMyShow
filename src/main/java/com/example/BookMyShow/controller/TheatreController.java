package com.example.BookMyShow.controller;

import com.example.BookMyShow.enums.SeatType;
import com.example.BookMyShow.model.City;
import com.example.BookMyShow.model.Hall;
import com.example.BookMyShow.model.Seat;
import com.example.BookMyShow.model.Theatre;
import com.example.BookMyShow.service.TheatreService;
import lombok.AllArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.List;

@AllArgsConstructor
public class TheatreController {

    TheatreService theatreService;

    //Create

    public String createCity(@NonNull final String cityName){
        String cityId = theatreService.createCity(cityName).getCityId();
        return cityId;
    }

    public String createTheatre(@NonNull final String theatreName,@NonNull final  String cityId){
        City city = theatreService.getCityFromId(cityId);
        String theatreId = theatreService.createTheatre(theatreName, city).getTheatreId();
        return theatreId;
    }

    public String createHall(@NonNull final String hallName,@NonNull final  String theatreId){
        Theatre theatre = theatreService.getTheatreFromId(theatreId);
        String hallId = theatreService.createHall(hallName, theatre).getHallId();
        return hallId;
    }

    public String createSeat(@NonNull final String seatName, @NonNull final SeatType seatType, @NonNull final String hallId){
        Hall hall = theatreService.getHallFromId(hallId);
        String seatId = theatreService.createSeat(seatName, seatType, hall).getSeatId();
        return seatId;
    }

    //Get data
    public List<City> getCities(){
        return theatreService.getCities();
    }

    public City getCity(String cityId){
        return theatreService.getCityFromId(cityId);
    }

}
