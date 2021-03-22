package br.com.minadakis.simonato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.minadakis.simonato.model.Produtos;
import br.com.minadakis.simonato.repository.ProdutosRepository;

@RestController
@RequestMapping("/aromaterapia/loja")
public class LojaController {
	
	@Autowired
	ProdutosRepository pr;

	@GetMapping
	public String exibeProdutos(Model model) {
		List<Produtos> produtos = pr.findAll();
		model.addAttribute("produtos", produtos);
		return "loja";
	}

}
