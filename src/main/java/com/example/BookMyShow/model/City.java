package com.example.BookMyShow.model;

import lombok.Getter;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Getter
public class City {
    private String cityId;
    private String cityName;
    //Don't include many relation in constructor - aggregation
    private List<Theatre> theatres;

    public City(@NonNull final String cityId,@NonNull final String cityName){
        this.cityId = cityId;
        this.cityName = cityName;
        this.theatres = new ArrayList<>();
    }

    public void addTheatre(@NonNull final Theatre theatre){
        this.theatres.add(theatre);
    }

}
