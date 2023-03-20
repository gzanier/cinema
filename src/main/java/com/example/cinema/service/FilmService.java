package com.example.cinema.service;

import com.example.cinema.model.Film;

public interface FilmService {


    public Film insert(String titolo, String autore, String produttore, String genere, int etaMinima, int durata);
}
