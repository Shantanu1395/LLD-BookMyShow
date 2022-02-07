package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MovieDetail {
    private Movie movie;
    private String movieName;
    private String cast;
    private String genre;
    private String releaseDate;
    private int runningTimeMinutes;
}
