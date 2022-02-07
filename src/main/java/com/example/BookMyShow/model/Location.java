package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Location {
    private String locationId;
    private String latitude;
    private String longitude;
    private String name;
}
