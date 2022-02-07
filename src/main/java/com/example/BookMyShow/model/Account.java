package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Account {
    private String accountId;
    private String password;
    private AccountStatus accountStatus;
}
