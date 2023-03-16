package com.genegration.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-World")
public class Controller {
	
@GetMapping("/Hello")
	public String HelloWorld() {
		return "HelloWorld";
		
		
	}

@GetMapping("/BSM")
public String BSM() {
	return "Responsabilidade pessoal, Mentalidade de Crescimento, Orientação ao Futuro, Persistência, Comunicação, Orientação aos Detalhes, Trabalho em Equipe, Proatividade.";
	
	
}

@GetMapping("/MOA")	
public String MOA() {
	return "Spring Boot";

}
}