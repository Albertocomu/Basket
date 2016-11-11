package com.example;

import com.example.domain.Jugador;
import com.example.service.JugadorService;
import com.example.service.EquipoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
		basePackageClasses = { BasketApplication.class, Jsr310JpaConverters.class }
)
@SpringBootApplication
public class BasketApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(BasketApplication.class, args);

		JugadorService jugadorService =context.getBean(JugadorService.class);

		EquipoService equipoService =context.getBean(EquipoService.class);

		equipoService.testEquipos();
		jugadorService.testJugadores();

	}
}