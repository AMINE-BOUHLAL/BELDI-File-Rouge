package com.example.BELDI.File.Rouge.Service;

import com.example.BELDI.File.Rouge.DTO.CommandeDTO;
import com.example.BELDI.File.Rouge.Mapper.CommandeMapper;
import com.example.BELDI.File.Rouge.Repository.CommandeRepository;
import com.example.BELDI.File.Rouge.model.Commande;

import org.springframework.stereotype.Service;

@Service
public class CommandeService {
    private final CommandeRepository commandeRepository;
    private final CommandeMapper commandeMapper;

    public CommandeService(CommandeRepository commandeRepository, CommandeMapper commandeMapper) {
        this.commandeRepository = commandeRepository;
        this.commandeMapper = commandeMapper;
    }


    public CommandeDTO create(CommandeDTO commandeDTO) {
         Commande commande = commandeMapper.toEntity(commandeDTO);
        Commande saved = commandeRepository.save(commande);
        return commandeMapper.ToDto(saved);
    }

    public void delete(Long id) {
        commandeRepository.deleteById(id);
    }
}
