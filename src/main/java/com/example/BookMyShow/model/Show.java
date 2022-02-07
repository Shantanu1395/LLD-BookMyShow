package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Show {
    private String showId;
    private Movie movie;
    private Hall hall;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
