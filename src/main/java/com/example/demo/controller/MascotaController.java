package com.example.demo.controller;

import com.example.demo.entity.Mascota;
import com.example.demo.entity.Sede;
import com.example.demo.repository.MascotaRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/mascota")
public class MascotaController {
    final MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping(value = {"/listaMasc"})
    public String listarMasc(Model model) {
        List<Mascota> listarMasc = mascotaRepository.findAll();
        model.addAttribute("listarMasc", listarMasc);
        return "mascota/listaMasc";
    }
}
