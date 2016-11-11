package com.example.repository;

import com.example.domain.Jugador;
import com.example.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador,Long> {

    List<Jugador> findByNombreContaining(String nombre);
    List<Jugador> findByCanastasGreaterThanEqual(Integer canastas);
    List<Jugador> findByAsistenciasBetween(int asistencias1, int asistencias2);
    List<Jugador> findByPosicion(String posicicion);
    List<Jugador> findByBirthdayBefore(LocalDate localDate);

    @Query("SELECT jugador.posicion, avg(jugador.canastas),avg (jugador.asistencias), avg (jugador.rebotes) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> findByPosicionStats();

    @Query("SELECT jugador.posicion, avg(jugador.canastas),max(jugador.canastas),min(jugador.canastas)," +
            "avg (jugador.asistencias),max(jugador.asistencias),min(jugador.asistencias)," +
            " avg (jugador.rebotes),max(jugador.rebotes),min(jugador.rebotes) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> findByPosicionStatsFull();




}