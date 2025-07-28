
package com.example.BELDI.File.Rouge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends User {

    private String adresse;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "client")
    private List<CommandePersonnalise> commandesPersonnalisees;

    @OneToMany(mappedBy = "client")
    private List<Review> reviews;
}
