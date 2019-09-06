package br.com.andersonpiotto.locadoraDeCarros.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * Classe responsavel pela criação de conexoes com o banco de dados.
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 */
public class ConnectionFactory {

	public static EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("locadora");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager;
	}

}
