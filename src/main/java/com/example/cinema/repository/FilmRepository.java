package com.example.cinema.repository;


import com.example.cinema.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository  extends JpaRepository<Film,Integer> {
}
