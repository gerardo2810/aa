package com.example.demo.controller;

import com.example.demo.entity.Sede;
import com.example.demo.repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sede")
public class SedeController {
    final SedeRepository sedeRepository;

    public SedeController(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }

    @GetMapping(value = {"/lista"})
    public String listarSede(Model model) {
        List<Sede> listaSede = sedeRepository.findAll();
        model.addAttribute("listarSede", listaSede);
        return "sede/lista";
    }
}
