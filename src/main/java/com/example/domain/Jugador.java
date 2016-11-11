package com.example.domain;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellidos;
    private LocalDate birthday;
    private Integer canastas;
    private Integer asistencias;
    private Integer rebotes;
    private String posicion;
    @ManyToOne
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, String apellidos, LocalDate birthday, int canastas, int sistencias, int rebotes, String posicion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.birthday = birthday;
        this.canastas = canastas;
        this.asistencias = sistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
    }

    public Long getId() {return id;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public LocalDate getBirthday() {return birthday;}
    public Integer getCanastas() {return canastas;}
    public Integer getAsistencias() {return asistencias;}
    public Integer getRebotes() {return rebotes;}
    public String getPosicion() {return posicion;}
    public Equipo getEquipo() {return equipo;}

    public void setId(Long id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setBirthday(LocalDate birthday) {this.birthday = birthday;}
    public void setCanastas(Integer canastas) {this.canastas = canastas;}
    public void setAsistencias(Integer asistencias) {this.asistencias = asistencias;}
    public void setRebotes(Integer rebotes) {this.rebotes = rebotes;}
    public void setPosicion(String posicion) {this.posicion = posicion;}
    public void setEquipo(Equipo equipo) {this.equipo = equipo;}

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", birthday=" + birthday +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                ", equipo=" + equipo.getNombre() +
                '}';
    }
}