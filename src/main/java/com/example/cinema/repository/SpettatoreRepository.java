package com.example.cinema.repository;

import com.example.cinema.model.Spettatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpettatoreRepository extends JpaRepository<Spettatore,Integer> {
}
