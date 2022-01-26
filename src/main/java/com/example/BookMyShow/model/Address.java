package com.example.BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String country;
}
