package br.com.andersonpiotto.locadoraDeCarros.teste;
import java.util.Calendar;

import br.com.andersonpiotto.locadoraDeCarros.dao.ConnectionFactory;
import br.com.andersonpiotto.locadoraDeCarros.dao.LocadoraDAO;
import br.com.andersonpiotto.locadoraDeCarros.model.Carro;
import br.com.andersonpiotto.locadoraDeCarros.model.Locacao;
import br.com.andersonpiotto.locadoraDeCarros.model.Locadora;

/**
 * Classe de testes da <code>Locadora</code>.
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 */
public class TesteInsercaoLocadora {
	
	public static void main(String[] args) {
		Locadora locadora = new Locadora();
		locadora.setNome("LOCALIZA");
		
		Carro carro1 = new Carro();
		carro1.setNome("Camaro");
		carro1.setCor("Amarela");
		carro1.setMarca("Chevrolet");
		carro1.setPlaca("ABC-7000");
		
		Locacao locacao1 = new Locacao();
		locacao1.setCarro(carro1);
		locacao1.setValor(3000);
		locacao1.setDataLocacao(Calendar.getInstance());

		Carro carro2 = new Carro();
		carro2.setNome("Fusca");
		carro2.setCor("Branco");
		carro2.setMarca("Wolks");
		carro2.setPlaca("OPA-9099");

		Locacao locacao2 = new Locacao();
		locacao2.setCarro(carro2);
		locacao2.setValor(50);
		locacao2.setDataLocacao(Calendar.getInstance());
		
		locadora.adicionaLocacao(locacao1);
		locadora.adicionaLocacao(locacao2);
		
		LocadoraDAO locadoraDAO = new LocadoraDAO(ConnectionFactory.getEntityManager());
		locadoraDAO.adicionaLocadora(locadora);
	}

}
