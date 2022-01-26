package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeat extends Seat{
    private String showSeatId;
    private Show show;
    private boolean isReserved;
    private int price;
}
