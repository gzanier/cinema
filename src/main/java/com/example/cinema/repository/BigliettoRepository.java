package com.example.cinema.repository;

import com.example.cinema.model.Biglietto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BigliettoRepository  extends JpaRepository<Biglietto, Integer> {
}
