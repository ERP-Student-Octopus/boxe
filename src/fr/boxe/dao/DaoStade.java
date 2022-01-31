package fr.boxe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.boxe.model.Stade;

public class DaoStade {
	
	protected EntityManager entityManager = null;
	
	public DaoStade() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("boxe");
		entityManager = emf.createEntityManager();
	}
	
	public Stade save (Stade entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Stade update (Stade entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Stade remove (Stade entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Stade find (int idValue) {
		return (Stade) entityManager.find(Stade.class, idValue);
	}
	public List<Stade> findAll() {
		String query = "Select o from Stade o";
		return entityManager.createQuery(query).getResultList();
	}
}
