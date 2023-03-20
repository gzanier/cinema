package com.example.cinema.service;

import com.example.cinema.model.Spettatore;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public interface SalaService {

    public Boolean emptySala(int id);

    public Spettatore consentireIngresso(int id, String nome, String cognome, LocalDate dataDiNascita);





}
