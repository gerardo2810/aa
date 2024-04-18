package com.example.demo.repository;

import com.example.demo.entity.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarioRepository extends JpaRepository<Veterinario,Integer> {

}
