package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@GetMapping("/")
    public void obtenerSaludo(@RequestParam(value = "nombre", defaultValue = "Invitado") String nombre) {
		logger.info("Se ha solicitado un saludo para el nombre: " + nombre);
    }
	

}
