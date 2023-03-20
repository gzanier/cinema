package com.example.cinema.service.impl;

import com.example.cinema.model.Film;
import com.example.cinema.repository.FilmRepository;
import com.example.cinema.service.FilmService;
import liquibase.pro.packaged.F;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public Film insert(String titolo, String autore, String produttore, String genere, int etaMinima, int durata) {
        return filmRepository.save(Film.builder()
                .titolo(titolo)
                .autore(autore)
                .produttore(produttore)
                .genere(genere)
                .etaMinima(etaMinima)
                .durata(durata)
                .build());
    }
}
