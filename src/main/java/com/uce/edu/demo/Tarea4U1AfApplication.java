package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matricula.Matricula;


@SpringBootApplication
public class Tarea4U1AfApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Tarea4U1AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Matricula matricula1=new Matricula();
		matricula1.matricular("Axel", "Flores", LocalDateTime.of(2000, 06, 28, 22, 56), 
				"Programación Avanzada II", 210, LocalDateTime.now());
		System.out.println(matricula1.toString());
	}

}
