package com.example.cinema.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int capacitaMax;

    @ManyToOne
    @JoinColumn(name = "idFilm")
    private Film film;

    @Transient
    private int idFilm;

    @OneToMany
    @JoinColumn(name = "idSpettatore")
    private List<Spettatore> spettatoreList;

    @Transient
    private int idSpettatore;


    public double calcolaIncassoSala() {
       /* double total = 0;
        for (Spettatore spettatore : spettatoreList) {
             spettatore.getSconto(spettatore.getBiglietto()).getPrezzo();
        }
        return total;*/
        //List<Spettatore> spettatoreList = this.spettatoreList();
        if (spettatoreList.isEmpty()) {
            return 0;
        }
        //return spettatoreList.stream().mapToDouble(spettatore ->spettatore.getSconto(spettatore.getBiglietto()).getPrezzo()).sum();
        return spettatoreList.stream().mapToDouble(spettatore -> spettatore.getBiglietto().getPrezzo()).sum();



    }
}
