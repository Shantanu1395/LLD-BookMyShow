package com.example.BookMyShow;

import com.example.BookMyShow.model.City;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class TestCase1 extends BaseSetup{

    String cityId;

    @BeforeEach
    void setUp() {
         cityId = setupControllers();
    }

    @Test
    void testCase1(){
        //Get Infra
        City city = theatreController.getCity(cityId);

        //Create movie
        String movieID = movieController.createMovie("Matrix");

        //Create show


        //CreateUser

        //CreateBooking

        //CreatePayment

        //Validate SeatsBooked

    }

}
