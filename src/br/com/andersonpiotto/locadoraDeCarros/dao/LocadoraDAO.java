package br.com.andersonpiotto.locadoraDeCarros.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.andersonpiotto.locadoraDeCarros.model.Locadora;

/**
 * Classe responsavel pela manipulação de dados da entidade <code>Locadora</code>
 * 
 * @author Anderson Piotto
 * @version 1.0.0
 */
public class LocadoraDAO {

	private EntityManager entityManager;

	public LocadoraDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void adicionaLocadora(Locadora locadora) {
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(locadora);
		this.entityManager.getTransaction().commit();
	}

	public void removeLocadora(Locadora locadora) {
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(locadora);
		this.entityManager.getTransaction().commit();
	}

	public void alteraLocadora(Locadora locadora) {
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(locadora);
		this.entityManager.getTransaction().commit();
	}

	public Locadora findById(Long id) {
		this.entityManager.getTransaction().begin();
		Locadora locadora = this.entityManager.find(Locadora.class, id);
		this.entityManager.getTransaction().commit();

		return locadora;
	}

	public List<Locadora> findAll() {
		TypedQuery<Locadora> query = entityManager.createQuery("select * from locadora order by locadora.nome ASC", Locadora.class);
		query.setFirstResult(1);
		query.setMaxResults(10);
		return query.getResultList();
	}
	
	public long getQuantidadeDeLocadoras() {
		Query query = entityManager.createQuery("select count(l) from locadora l");
		return (long) query.getSingleResult();
	}
	
	public Locadora findByName(String name) {
		
		TypedQuery<Locadora> query = entityManager.createQuery("select * from locadora"
				+ " where nome = :nome", Locadora.class);
		
		query.setParameter("nome", name);
		
		return query.getSingleResult();
		
	}

}
