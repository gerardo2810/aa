package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

public class Mascota {
    @Id
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @Column(name = "genero", length = 45)
    private String genero;

    @Column(name = "diagnostico", length = 100)
    private String diagnostico;

    @Column(name = "fecha_cita")
    private Date fechacita;

    @Column(name = "numero_consultorio")
    private int numeroconsultorio;

    @Column(name = "veterinario_id")
    private int veterinarioid;

    @Column(name = "sede_id")
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFechacita() {
        return fechacita;
    }

    public void setFechacita(Date fechacita) {
        this.fechacita = fechacita;
    }

    public int getNumeroconsultorio() {
        return numeroconsultorio;
    }

    public void setNumeroconsultorio(int numeroconsultorio) {
        this.numeroconsultorio = numeroconsultorio;
    }

    public int getVeterinarioid() {
        return veterinarioid;
    }

    public void setVeterinarioid(int veterinarioid) {
        this.veterinarioid = veterinarioid;
    }

    public int getSedeid() {
        return sedeid;
    }

    public void setSedeid(int sedeid) {
        this.sedeid = sedeid;
    }
}
