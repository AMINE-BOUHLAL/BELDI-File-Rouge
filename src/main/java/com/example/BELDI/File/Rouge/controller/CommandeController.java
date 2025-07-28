package com.example.BELDI.File.Rouge.controller;


import com.example.BELDI.File.Rouge.DTO.CommandeDTO;
import com.example.BELDI.File.Rouge.Service.CommandeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller("/Command")
public class CommandeController {
    private final CommandeService commandeService;


    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @PostMapping
    public CommandeDTO add(@RequestBody CommandeDTO commandeDTO) {
        return commandeService.create(commandeDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        commandeService.delete(id);
    }
}
