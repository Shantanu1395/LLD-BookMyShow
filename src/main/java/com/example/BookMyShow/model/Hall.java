package com.example.BookMyShow.model;

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
public class Hall {
    private String hallId;
    private String name;
    private Theatre theatre;
    List<Seat> seats = new ArrayList();
}
