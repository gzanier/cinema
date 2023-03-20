package com.example.cinema.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spettatori")
public class Spettatore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

    private Biglietto biglietto;


    public Boolean isAdult() {
        if(age(this.dataDiNascita)>=18){return true;}
        return false;
    }

    public int age(LocalDate dataDiNascita) {
        LocalDate today = LocalDate.now();
        return Period.between(this.dataDiNascita, today).getYears();
    }
    public Biglietto getSconto(Biglietto biglietto) {
        if(age(this.dataDiNascita)>=70){
            biglietto.setPrezzo( biglietto.getPrezzoRidotto(biglietto.getPrezzo(), 10.0) );
        }else if(age(this.dataDiNascita)<5){
            biglietto.setPrezzo( biglietto.getPrezzoRidotto(biglietto.getPrezzo(), 50.0) );
        }

        return biglietto;
    }
}
