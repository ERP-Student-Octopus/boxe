package fr.boxe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.boxe.model.Combattant;
import fr.boxe.model.Combat;

public class DaoCombattant {
	
	protected EntityManager entityManager = null;
	
	public DaoCombattant() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("boxe");
		entityManager = emf.createEntityManager();
	}
	
	public Combattant save (Combattant entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Combattant update (Combattant entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Combattant remove (Combattant entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Combattant find (int idValue) {
		return (Combattant) entityManager.find(Combattant.class, idValue);
	}
	public List<Combattant> findAll() {
		String query = "Select o from Combatttant o";
		return entityManager.createQuery(query).getResultList();
	}

}
