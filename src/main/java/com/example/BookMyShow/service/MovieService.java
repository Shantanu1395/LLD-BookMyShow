package com.example.BookMyShow.service;

import com.example.BookMyShow.model.Movie;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MovieService {

    private final Map<String, Movie> movieMap;

    public MovieService() {
        this.movieMap = new HashMap<>();
    }

    public Movie getMovie(@NonNull final String movieId) {
        return movieMap.get(movieId);
    }

    public Movie createMovie(@NonNull final String movieName) {
        String movieId = UUID.randomUUID().toString();
        Movie movie = new Movie(movieId, movieName);
        movieMap.put(movieId, movie);
        return movie;
    }

}
