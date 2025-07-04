package com.example.BELDI.File.Rouge.Mapper;

import com.example.BELDI.File.Rouge.DTO.ProduitDTO;
import com.example.BELDI.File.Rouge.model.Produit;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring",uses = {ProduitMapper.class})
public interface ProduitMapper {

    ProduitDTO ToDto(Produit produit);
    Produit toEntity(ProduitDTO produitDTO);
    List<ProduitDTO> ToDto(List<Produit> produits);

    List<Produit> toEntity(List<ProduitDTO> produitDTOs);
}

