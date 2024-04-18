package com.example.demo.controller;

import com.example.demo.entity.Veterinario;
import com.example.demo.repository.VeterinarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/veterinario")
public class VeterinarioController {
    final VeterinarioRepository veterinarioRepository;

    public VeterinarioController(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }

    @GetMapping(value = {"/listaVet"})
    public String listarVet(Model model) {
        List<Veterinario> listaVet = veterinarioRepository.findAll();
        model.addAttribute("listarVet", listaVet);
        return "veterinario/listaVet";
    }
}
