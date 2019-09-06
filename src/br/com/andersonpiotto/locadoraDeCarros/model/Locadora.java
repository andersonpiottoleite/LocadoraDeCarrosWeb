package br.com.andersonpiotto.locadoraDeCarros.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Classe que representa uma <code>Locadora</code>.
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 */

@Entity
public class Locadora {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	List<Locacao> locacoes;

	public void adicionaLocacao(Locacao locacao) {
		if (locacoes == null) {
			locacoes = new ArrayList<Locacao>();
		}

		locacoes.add(locacao);
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}
	
	@Override
	public String toString() {
		return getNome();
	}

}
