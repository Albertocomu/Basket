package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    public void testEquipos() {

        Equipo oklahoma = new Equipo("Thunder", "Oklahoma City", LocalDate.of(1938, 10, 2));
        equipoRepository.save(oklahoma);

        Equipo cavs = new Equipo ("Cavaliers", "Cliveland", LocalDate.of(1912, 11, 10));
        equipoRepository.save(cavs);

        Equipo lakers = new Equipo ("Lakers", "Los Angeles", LocalDate.of(1902, 11, 10));
        equipoRepository.save(lakers);

        Equipo bulls = new Equipo ("Bulls", "Chicago", LocalDate.of(1909, 11, 10));
        equipoRepository.save(bulls);

        Equipo heat = new Equipo ("Heat", "Miami", LocalDate.of(1923, 11, 10));
        equipoRepository.save(heat);

    }
}
