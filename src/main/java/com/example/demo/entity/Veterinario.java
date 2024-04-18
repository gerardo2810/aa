package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="veterinario")
public class Veterinario {
    @Id
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "correo", length = 50)
    private String correo;

    @Column(name="sede_id")
    private int sedeid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSedeid() {
        return sedeid;
    }

    public void setSedeid(int sedeid) {
        this.sedeid = sedeid;
    }
}
