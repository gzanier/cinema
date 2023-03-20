package com.example.cinema.service.impl;

import com.example.cinema.model.Sala;
import com.example.cinema.model.Spettatore;
import com.example.cinema.repository.SalaRepository;
import com.example.cinema.repository.SpettatoreRepository;
import com.example.cinema.service.SalaService;

import java.time.LocalDate;
import java.util.List;

public class SalaServiceImpl implements SalaService {


    private SalaRepository salaRepository;
    private SpettatoreRepository spettatoreRepository;

    public SalaServiceImpl(SalaRepository salaRepository, SpettatoreRepository spettatoreRepository) {
        this.salaRepository = salaRepository;
        this.spettatoreRepository = spettatoreRepository;
    }


    @Override
    public Boolean emptySala(int id) {
        //Boolean result = false;
        Sala sala = salaRepository.getById(id);

        List<Spettatore> spettatoreList = spettatoreRepository.findAll();
        if (!spettatoreList.isEmpty()) {
            for(Spettatore spettatore : spettatoreList) {
                if(spettatore.getBiglietto().getSala().getId()==id){
                    spettatoreList.remove(spettatore);
                }
            }
           // spettatoreList.stream().forEach(spettatore -> spettatoreList.remove(spettatore));
        }

        return true;
    }

    @Override
    public Spettatore consentireIngresso(int id, String nome, String cognome, LocalDate dataDiNascita) {
        Sala sala = salaRepository.getReferenceById(id);
        return null;
    }
}
