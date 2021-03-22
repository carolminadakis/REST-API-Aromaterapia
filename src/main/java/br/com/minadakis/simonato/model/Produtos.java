package br.com.minadakis.simonato.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Integer id;
	
	@NotBlank @NotNull
	@Column(name = "nome_produto")
	private String nome;
	
	@NotBlank @NotNull
	@Column(name = "descrição_produto")
	private String descricao;
	
	@NotBlank @NotNull
	@Column(name = "preço_produto")
	private BigDecimal preco;
}
