package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
    private String seatId;
    private SeatType seatType;
    private Hall hall;
}
