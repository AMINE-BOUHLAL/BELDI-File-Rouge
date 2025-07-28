package com.example.BELDI.File.Rouge.DTO;


import com.example.BELDI.File.Rouge.model.Client;
import com.example.BELDI.File.Rouge.model.Produit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommandeDTO {
    private LocalDate dateCommande;
    private LocalDate dateLivraison;
    private String description;
    private String adresse;
    private Double prix;
    private int telephone;
    private Client client;
    private List<Produit> produits;

}
