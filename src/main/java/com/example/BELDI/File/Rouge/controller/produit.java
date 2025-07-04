package com.example.BELDI.File.Rouge.controller;

import com.example.BELDI.File.Rouge.DTO.ProduitDTO;
import com.example.BELDI.File.Rouge.Service.ProduitService;
import com.example.BELDI.File.Rouge.model.Produit;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produit")

public class produit extends Produit {
    private final ProduitService produitService;

    public produit(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/")
    public List<ProduitDTO> get() {
        return produitService.getProduits();
    }

    @PostMapping
    public ProduitDTO add(@RequestBody ProduitDTO produitDTO) {
        return produitService.create(produitDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produitService.delete(id);
    }
}
