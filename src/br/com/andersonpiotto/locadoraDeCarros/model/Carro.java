package br.com.andersonpiotto.locadoraDeCarros.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa um <code>Carro</code>.
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 */

@Entity
public class Carro {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String marca;// poderia ser uma classe.
	private String cor;
	private String placa;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
