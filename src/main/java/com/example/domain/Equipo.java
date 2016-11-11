package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Equipo {//identificador, nombre, localidad y fecha de creación.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String localidad;
    private LocalDate fechaCreacion;

    public Equipo() {
    }

    public Equipo(String nombre, String localidad, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {return id;}
    public String getNombre() {return nombre;}
    public String getLocalidad() {return localidad;}
    public LocalDate getFechaCreacion() {return fechaCreacion;}


    public void setId(Long id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setLocalidad(String localidad) {this.localidad = localidad;}


    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}