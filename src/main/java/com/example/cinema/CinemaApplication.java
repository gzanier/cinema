package com.example.cinema;

import com.example.cinema.model.Biglietto;
import com.example.cinema.model.Cinema;
import com.example.cinema.model.Sala;
import com.example.cinema.model.Spettatore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
        /*Cinema cinema = new Cinema();
        List<Sala> salaList = new ArrayList<Sala>();
        Sala sala1 = new Sala();
        Sala sala2 = new Sala();
        salaList.add(sala1);
        salaList.add(sala2);


        Spettatore s1 = new Spettatore();
        List<Spettatore> spettatoreList = new ArrayList<Spettatore>();
        List<Spettatore> spettatoreList2 = new ArrayList<Spettatore>();


        s1.setDataDiNascita(LocalDate.of(2023, 01, 01));
        Biglietto b1 = new Biglietto();
        b1.setPrezzo(10);

        spettatoreList.add(s1);
        spettatoreList.add(s1);
        spettatoreList.add(s1);
        spettatoreList.add(s1);

        spettatoreList2.add(s1);
        spettatoreList2.add(s1);
        spettatoreList2.add(s1);
        cinema.setSalaList(salaList);
        s1.setBiglietto(b1);
        sala1.setSpettatoreList(spettatoreList);
        sala2.setSpettatoreList(spettatoreList2);


        System.out.println(b1.getPrezzo());
        System.out.println(spettatoreList);
        System.out.println(sala1.calcolaIncassoSala());
        System.out.println(sala2.calcolaIncassoSala());
        System.out.println(cinema.calcolaIncasso());

        */


    }

}
