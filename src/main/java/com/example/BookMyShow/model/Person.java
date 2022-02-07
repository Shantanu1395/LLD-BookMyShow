package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.AccountStatus;
import com.example.BookMyShow.enums.PersonType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class Person extends Account{
    private String personId;
    private Address address;
    private String email;
    private String phoneNo;
    private PersonType personType;

    public Person(String accountId, String password, AccountStatus accountStatus) {
        super(accountId, password, accountStatus);
    }
}
