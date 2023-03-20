package com.example.cinema.controller;

import com.example.cinema.model.Film;
import com.example.cinema.service.FilmService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cinema")
public class FilmController {

    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping()
    public Film insert(@RequestBody Film film) {
        return filmService.insert(film.getTitolo(), film.getAutore(), film.getProduttore(), film.getGenere(), film.getEtaMinima(), film.getDurata());
    }

}
