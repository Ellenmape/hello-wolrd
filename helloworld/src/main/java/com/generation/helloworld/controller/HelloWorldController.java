package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {
	@GetMapping ("olamundo")
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
    @GetMapping("bsm")
    public String bsmGeneration() {
    	return "Persistência \nOrientação ao Detalhe\nOrientação ao Futuro\nResponsabilidade Pessoal\n"
    			+ "Trabalho em Equipe\nProatividade\nComunicação";
    }
    @GetMapping("objetivos")
    public String objetivosGen() {
    	return "Comunição\nMelhorar habilidades técnicas\nRalizar mais exercícios em Spring e MySQL";
    }
}
   
