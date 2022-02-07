package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor // Everything needs to be included in constructor - composition
public class Booking {
    @Id
    private String bookingId;
    private Person customerId;
    private Show show;
    private List<ShowSeat> showSeatList = new ArrayList();
    private BookingStatus bookingStatus;
}
