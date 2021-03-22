package br.com.minadakis.simonato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aromaterapia")
public class HomeController {
	
	@GetMapping
	public String homePage() {
		return "home";		//A pág html tem que ter exatamente o nome do retorno da view!
	}

}
