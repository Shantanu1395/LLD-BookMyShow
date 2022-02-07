package com.example.BookMyShow.service;

import com.example.BookMyShow.enums.SeatType;
import com.example.BookMyShow.model.City;
import com.example.BookMyShow.model.Hall;
import com.example.BookMyShow.model.Seat;
import com.example.BookMyShow.model.Theatre;
import org.springframework.lang.NonNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TheatreService {

    Map<String, City> cityMap = new HashMap();
    Map<String, Theatre> theatreMap = new HashMap();
    Map<String, Hall> hallMap = new HashMap();
    Map<String, Seat> seatMap = new HashMap();

    //Create city, theatre, hall, seat

    public City createCity(@NonNull final String cityName) {
        String cityId = UUID.randomUUID().toString();
        City city = new City(cityId, cityName);
        cityMap.put(cityId, city);
        return city;
    }

    public Theatre createTheatre(@NonNull final String theatreName,@NonNull final City city) {
        String theatreId = UUID.randomUUID().toString();
        Theatre theatre = new Theatre(theatreId, theatreName, city);
        city.addTheatre(theatre);
        theatreMap.put(theatreId, theatre);
        return theatre;
    }

    public Hall createHall(String hallName, Theatre theatre) {
        String hallId = UUID.randomUUID().toString();
        Hall hall = new Hall(hallId, hallName, theatre);
        theatre.addHallsToTheatre(hall);
        hallMap.put(hallId, hall);
        return hall;
    }

    public Seat createSeat(String seatName, SeatType seatType, Hall hall) {
        String seatId = UUID.randomUUID().toString();
        Seat seat = new Seat(seatId, seatType, hall, seatName);
        hall.addSeatsToTheatre(seat);
        seatMap.put(seatId, seat);
        return seat;
    }

    //Get City, Theatre, Hall, Seat

    public City getCityFromId(@NonNull final String cityId){
        return cityMap.get(cityId);
    }

    public Theatre getTheatreFromId(@NonNull final String theatreId){
        return theatreMap.get(theatreId);
    }

    public Hall getHallFromId(@NonNull final String hallId){
        return hallMap.get(hallId);
    }

    public Seat getSeatFromId(@NonNull final String seatId){
        return seatMap.get(seatId);
    }

    public List<City> getCities() {
        return cityMap.values().stream().toList();
    }

    public List<Theatre> getTheatres() {
        return theatreMap.values().stream().toList();
    }

    public List<Hall> getHalls() {
        return hallMap.values().stream().toList();
    }

    public List<Seat> getSeats() {
        return seatMap.values().stream().toList();
    }
}
