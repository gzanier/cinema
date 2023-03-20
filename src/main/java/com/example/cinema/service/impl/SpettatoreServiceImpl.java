package com.example.cinema.service.impl;

import com.example.cinema.model.Sala;
import com.example.cinema.model.Spettatore;
import com.example.cinema.repository.SalaRepository;
import com.example.cinema.repository.SpettatoreRepository;
import com.example.cinema.service.SpettatoreService;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class SpettatoreServiceImpl implements SpettatoreService {

    private SpettatoreRepository spettatoreRepository;
    private SalaRepository salaRepository;

    private EntityManager entityManager;

    public SpettatoreServiceImpl(SpettatoreRepository spettatoreRepository, SalaRepository salaRepository, EntityManager entityManager) {
        this.spettatoreRepository = spettatoreRepository;
        this.salaRepository = salaRepository;
        this.entityManager = entityManager;
    }

    @Override
    public List<Spettatore> getByIdSala(int id) {
        return null;

   /*     spettatoreRe


        List<Spettatore> spettatore

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Spettatore> query = cb.createQuery(Spettatore.class);
        Root<Spettatore> rootSpettatore = query.from(Spettatore.class);
        Join<Spettatore, Sala> joinSala = rootSpettatore.join("sala", JoinType.INNER);

        Path<int> path = joinSala.get()

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(path, id));

        query.select(rootSpettatore).where(cb.and(predicates.toArray(new Predicate[predicates.size()])));

        List<Spettatore> spettatoreList = entityManager.createQuery(query).getResultList();

        return spettatoreList;*/


    }

}



