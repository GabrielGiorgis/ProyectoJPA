package com.Parcial1.ProyectoJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoJpaApplication.class, args);
		System.out.println("Running in port 8081");
	}

}
