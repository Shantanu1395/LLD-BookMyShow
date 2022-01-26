package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.PersonType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person extends Account{
    private String personId;
    private Address address;
    private String email;
    private String phoneNo;
    private PersonType personType;
}
