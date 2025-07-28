package com.example.BELDI.File.Rouge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    private Long id;
    private String name;
    private String description;
    private String image;
    private double prix;
    private int quantity;
    private String ingredients;
    private String statut;


    @OneToMany(mappedBy = "produit")
    private List<Review> reviews;

    @ManyToMany(mappedBy = "produits")
    private List<Commande> commandes;
}
