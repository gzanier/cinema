package com.example.cinema.model;

import liquibase.pro.packaged.L;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class SpettatoreTest {

    //test se lo spettatore fa 18 anni oggi (20/03/2023) allora è maggiorenne

    @Test
    void givenisAdultwhenAdultTodayThenTrue() {
        //arrange
        Spettatore spettatore = new Spettatore();
        LocalDate birthday = LocalDate.of(2005, 03, 20);
        //act
        spettatore.setDataDiNascita(birthday);
        Boolean result = spettatore.isAdult();
        //assert
        assertTrue(result);
    }

    @Test
    void givenisAdultwhenAdultThenTrue() {
        //arrange
        Spettatore spettatore = new Spettatore();
        LocalDate birthday = LocalDate.of(2005, 03, 19);
        //act
        spettatore.setDataDiNascita(birthday);
        Boolean result = spettatore.isAdult();
        //assert
        assertTrue(result);
    }


    @Test
    void givenisAdultwhenNotAdultThenFalse() {
        //arrange
        Spettatore spettatore = new Spettatore();
        LocalDate birthday = LocalDate.of(2020, 03, 20);
        //act
        spettatore.setDataDiNascita(birthday);
        Boolean result = spettatore.isAdult();
        //assert
        assertFalse(result);

    }


    //test se lo spettatore fa 18 anni domani (21/03/2023) non è maggiorenne
    @Test
    void givenisAdultwhenAdultTomorrowThenFalse() {
        //arrange
        Spettatore spettatore = new Spettatore();
        LocalDate birthday = LocalDate.of(2005, 03, 21);
        //act
        spettatore.setDataDiNascita(birthday);
        Boolean result = spettatore.isAdult();
        //assert
        assertFalse(result);

    }
}