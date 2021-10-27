package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/objetivos")
public class ObjetivosController {
	@GetMapping
	public String objetivos() {
		return "\nAprender Spring-boot, estudar inglês," +
				" evoluir no MySQL, evoluir no Java," +
				" e continuar persistindo porque foguete não tem ré";
	}

}
