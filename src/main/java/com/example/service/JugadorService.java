package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugadores() {

        Equipo oklahoma = equipoRepository.findOne(1L);
        Equipo cavs = equipoRepository.findOne(2L);
        Equipo lakers = equipoRepository.findOne(3L);
        Equipo bulls = equipoRepository.findOne(4L);
        Equipo heat = equipoRepository.findOne(5L);


        Jugador alberto = new Jugador();
        alberto.setNombre("Alberto");
        alberto.setApellidos("Comuñas");
        alberto.setBirthday(LocalDate.of(1988, 10, 2));
        alberto.setAsistencias(11);
        alberto.setCanastas(20);
        alberto.setRebotes(10);
        alberto.setPosicion("Pivot");
        alberto.setEquipo(oklahoma);
        jugadorRepository.save(alberto);

        Jugador sergio = new Jugador();
        sergio.setNombre("Sergio");
        sergio.setApellidos("Diaz");
        sergio.setBirthday(LocalDate.of(1996, 10, 2));
        sergio.setAsistencias(11);
        sergio.setCanastas(10);
        sergio.setRebotes(3);
        sergio.setPosicion("Alero");
        sergio.setEquipo(oklahoma);
        jugadorRepository.save(sergio);

        Jugador fernando = new Jugador();
        fernando.setNombre("Fernando");
        fernando.setApellidos("Aranda");
        fernando.setBirthday(LocalDate.of(1992, 10, 2));
        fernando.setAsistencias(21);
        fernando.setCanastas(20);
        fernando.setRebotes(4);
        fernando.setPosicion("Base");
        fernando.setEquipo(cavs);
        jugadorRepository.save(fernando);

        Jugador larry = new Jugador();
        larry.setNombre("Larry");
        larry.setApellidos("André");
        larry.setBirthday(LocalDate.of(1990, 10, 2));
        larry.setAsistencias(3);
        larry.setCanastas(10);
        larry.setRebotes(16);
        larry.setPosicion("Ala-Pivot");
        larry.setEquipo(oklahoma);
        jugadorRepository.save(larry);

        Jugador victor = new Jugador();
        victor.setNombre("Victor");
        victor.setApellidos("Amador");
        victor.setBirthday(LocalDate.of(1995, 10, 2));
        victor.setAsistencias(3);
        victor.setCanastas(1);
        victor.setRebotes(16);
        victor.setPosicion("Escolta");
        victor.setEquipo(cavs);
        jugadorRepository.save(victor);


        System.out.println(jugadorRepository.findByNombreContaining("Alber"));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(10));
        System.out.println(jugadorRepository.findByAsistenciasBetween(1, 10));
        System.out.println(jugadorRepository.findByPosicion("alero"));
        System.out.println(jugadorRepository.findByBirthdayBefore(LocalDate.of(1995, 1, 1)));
        posicionStats(jugadorRepository.findByPosicionStats());
        posicionStatsFull(jugadorRepository.findByPosicionStatsFull());

        System.out.println(equipoRepository.findByLocalidad("Cliveland"));
        System.out.println(equipoRepository.findByJugadoresPorEquipo("Thunder"));
        System.out.println(equipoRepository.findByJugadoresPorEquipoYPosicion("Thunder","Alero"));
    }


    static void posicionStats(List<Object[]> statisticsList) {

        for (Object[] jugador : statisticsList) {
            System.out.println("Posicion: " + jugador[0]);
            System.out.println("Canastas Avg: " + jugador[1]);
            System.out.println("Asistencias Avg: " + jugador[2]);
            System.out.println("Rebotes Avg: " + jugador[3] + System.lineSeparator());
        }
    }

    static void posicionStatsFull(List<Object[]> staticsListFull) {
        for (Object[] jugador : staticsListFull) {
            System.out.println("Posicion: " + jugador[0]);
            System.out.println("Canastas Avg: " + jugador[1]);
            System.out.println("Canastas Max: " + jugador[2]);
            System.out.println("Canastas Min: " + jugador[3]);
            System.out.println("Asistencias Avg: " + jugador[4]);
            System.out.println("Asistencias Max: " + jugador[5]);
            System.out.println("Asistencias: Min: " + jugador[6]);
            System.out.println("Rebotes Avg: " + jugador[7]);
            System.out.println("Rebotes Max: " + jugador[8]);
            System.out.println("Rebotes Min: " + jugador[9] + System.lineSeparator());
        }
    }
}