package com.example.BELDI.File.Rouge.Mapper;

import com.example.BELDI.File.Rouge.DTO.ProduitDTO;
import com.example.BELDI.File.Rouge.model.Produit;
import org.mapstruct.Mapper;

import java.util.List;


import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {ProduitMapper.class})
public interface ProduitMapper {

    @Mapping(source = "statut", target = "statu")
    ProduitDTO ToDto(Produit produit);
    @Mapping(source = "statu", target = "statut")
    Produit toEntity(ProduitDTO produitDTO);
    List<ProduitDTO> ToDto(List<Produit> produits);

    List<Produit> toEntity(List<ProduitDTO> produitDTOs);
}

