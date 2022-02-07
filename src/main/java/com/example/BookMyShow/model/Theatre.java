package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Theatre {

    private String theatreId;
    private String name;
    private City city;
    List<Hall> halls;

    //Other Metadata
    //private Location location;

    public Theatre(String theatreId, String name, City city){
        this.theatreId = theatreId;
        this.name = name;
        this.city = city;
        this.halls = new ArrayList<>();
    }

    public void addHallsToTheatre(Hall hall){
        this.halls.add(hall);
    }


}
