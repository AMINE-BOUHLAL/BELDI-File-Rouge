package com.example.BELDI.File.Rouge.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommandePersonnalise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ingredients;
    private LocalDate dateCommande;
    private LocalDate dateLivraison;
    private String description;
    private String adresse;
    private Double prix;
    private int telephone;

    @ManyToOne
    private Client client;
}