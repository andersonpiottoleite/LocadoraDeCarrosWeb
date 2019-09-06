package br.com.andersonpiotto.locadoraDeCarros.teste;

import br.com.andersonpiotto.locadoraDeCarros.dao.ConnectionFactory;
import br.com.andersonpiotto.locadoraDeCarros.dao.LocadoraDAO;
import br.com.andersonpiotto.locadoraDeCarros.model.Locadora;

/**
 * Classe de testes da <code>Locadora</code>.
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 */
public class TesteBuscaLocadora {
	public static void main(String[] args) {
		LocadoraDAO locadoraDAO = new LocadoraDAO(ConnectionFactory.getEntityManager());
		
		Locadora locadora = locadoraDAO.findById(2L);
		
		System.out.println(locadora);
	}
}
