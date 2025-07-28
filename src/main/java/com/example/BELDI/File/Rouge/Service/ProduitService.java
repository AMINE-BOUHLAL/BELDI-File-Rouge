package com.example.BELDI.File.Rouge.Service;

import com.example.BELDI.File.Rouge.DTO.ProduitDTO;
import com.example.BELDI.File.Rouge.Mapper.ProduitMapper;
import com.example.BELDI.File.Rouge.Repository.ProduitRepository;
import com.example.BELDI.File.Rouge.model.Produit;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;
    private final ProduitMapper produitMapper;

    public ProduitService(ProduitRepository produitRepository, ProduitMapper produitMapper) {
        this.produitRepository = produitRepository;
        this.produitMapper = produitMapper;
    }


    public List<ProduitDTO> getProduits(){
        return produitMapper.ToDto(produitRepository.findAll());
    }

    public ProduitDTO create(ProduitDTO produitDTO) {
        Produit produit = produitMapper.toEntity(produitDTO);
        Produit saved = produitRepository.save(produit);
        return produitMapper.ToDto(saved);
    }

    public void delete(Long id) {
        produitRepository.deleteById(id);
    }


}
