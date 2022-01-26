package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    private String bookingId;
    private Person customerId;
    private Show show;
    private List<ShowSeat> showSeatList = new ArrayList();
    private BookingStatus bookingStatus;
}
