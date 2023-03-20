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
//@Table(name = "cinema") //non serve
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany
    @JoinColumn(name = "idSala")
    private List<Sala> salaList;

    @Transient
    private int idSala;

    public double calcolaIncasso(){
        return salaList.stream().mapToDouble(sala -> sala.calcolaIncassoSala()).sum();

    };

}
