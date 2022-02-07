package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Hall {
    private String hallId;
    private String name;
    private Theatre theatre;
    List<Seat> seats = new ArrayList();

    public Hall(String hallId, String name, Theatre theatre) {
        this.hallId = hallId;
        this.name = name;
        this.theatre = theatre;
        this.seats = new ArrayList<>();
    }

    public void addSeatsToTheatre(Seat seat){
        this.seats.add(seat);
    }

}
