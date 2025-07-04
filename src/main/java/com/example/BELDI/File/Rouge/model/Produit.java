package com.example.BELDI.File.Rouge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String statu;
}
