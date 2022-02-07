package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
public class ShowSeat extends Seat{
    private String showSeatId;
    private Show show;
    private boolean isReserved;
    private int price;

    public ShowSeat(String seatId, SeatType seatType, Hall hall, String seatName) {
        super(seatId, seatType, hall, seatName);
    }

    public ShowSeat(String seatId, SeatType seatType, Hall hall, String seatName, String showSeatId, Show show, boolean isReserved, int price) {
        super(seatId, seatType, hall, seatName);
        this.showSeatId = showSeatId;
        this.show = show;
        this.isReserved = isReserved;
        this.price = price;
    }

}
