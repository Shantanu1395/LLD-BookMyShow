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
public class City {
    private String cityId;
    private String cityName;
    private List<Theatre> theatres = new ArrayList();
}
