package br.com.minadakis.simonato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.minadakis.simonato.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {

}
