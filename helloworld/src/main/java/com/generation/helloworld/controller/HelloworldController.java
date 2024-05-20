package com.generation.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloworldController {
	@GetMapping
	public String ola() {
		return "Olá mundo! Bom dia!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nHamburguer";
	
	}
	@GetMapping("livros")
	public String livrosFavoritos() {
		return "Eragon \nSenhor dos Aneis";
	}
	@GetMapping("BSMs")
	public String BSMsGeneration() {
		return "Persistência \nMentalidade de Crescimento \nProficiente \nResponsabilidade Pessoal"
				+ " \nOrientação ao Futuro \nProatividade \nCounicação \nTrabalho em equipe \nOrientação ao Detalhe \n"
				+ "Boas Práticas";
	}
	@GetMapping("Objetivos")
	public String Objetivosdasemana() {
		return "Persistência \nComunicação \nOrientação ao detalhe \nTrabalho em equipe";
	}
		
	
	
}
