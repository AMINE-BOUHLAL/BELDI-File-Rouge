package com.example.BELDI.File.Rouge.Mapper;

import com.example.BELDI.File.Rouge.DTO.CommandeDTO;
import com.example.BELDI.File.Rouge.DTO.ProduitDTO;
import com.example.BELDI.File.Rouge.model.Commande;
import com.example.BELDI.File.Rouge.model.Produit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper (componentModel = "spring",uses = {CommandeMapper.class})
public interface CommandeMapper {
    CommandeDTO ToDto(Commande commande);
    Commande toEntity(CommandeDTO commandeDTO);
    List<CommandeDTO> ToDto(List<Commande> Commandes);

    List<Commande> toEntity(List<CommandeDTO> commandeDTOs);
}
