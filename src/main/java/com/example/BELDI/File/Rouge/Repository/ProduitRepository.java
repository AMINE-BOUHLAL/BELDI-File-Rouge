package com.example.BELDI.File.Rouge.Repository;

import com.example.BELDI.File.Rouge.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    List<Produit> id(Long id);
}
