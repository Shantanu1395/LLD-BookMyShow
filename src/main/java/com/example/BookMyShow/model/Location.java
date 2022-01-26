package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    private String locationId;
    private String latitude;
    private String longitude;
    private String name;
}
