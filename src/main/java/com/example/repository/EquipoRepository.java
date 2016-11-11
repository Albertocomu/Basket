package com.example.repository;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    List<Equipo> findByLocalidad(String localidad);

    @Query("SELECT jugador FROM Jugador jugador WHERE jugador.equipo.nombre = :nombre")
    List<Jugador> findByJugadoresPorEquipo(@Param("nombre") String nombre);

    @Query("SELECT jugador FROM Jugador jugador WHERE jugador.equipo.nombre = :nombre AND jugador.posicion = :posicion ")
    List<Jugador> findByJugadoresPorEquipoYPosicion(
            @Param("nombre") String nombre,
            @Param("posicion") String posicion);

    
}
