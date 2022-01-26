package com.example.BookMyShow.model;

import com.example.BookMyShow.enums.PaymentMode;
import com.example.BookMyShow.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String transactionId;
    private int amount;
    private PaymentStatus paymentStatus;
    private PaymentMode paymentMode;
}
