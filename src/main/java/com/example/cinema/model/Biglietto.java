package com.example.cinema.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "biglietti")
public class Biglietto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String posizione;
    private double prezzo;

    @ManyToOne
    @JoinColumn(name = "idSala")
    private Sala sala;
    @Transient
    private int idSala;

    public String printPosizione() {
        return String.valueOf(this.id + " "+idSala);
    }

 // restituisce il prezzo scontato del 10%
    public double getPrezzoRidottoAnziani(Double prezzo){
        return prezzo*90/100;
    }
    // restituisce il prezzo scontato del 10%
    public double getPrezzoRidottoBambini(Double prezzo){
        return prezzo*50/100;
    }

    //restituisce il prezzo scontato del valore passato in input
    public double getPrezzoRidotto(Double prezzo, Double sconto){
        return prezzo-prezzo*sconto/100;
    }

}
