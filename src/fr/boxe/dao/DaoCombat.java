package fr.boxe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.boxe.model.Combat;

public class DaoCombat {
	
	protected EntityManager entityManager = null;
	
	public DaoCombat() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("boxe");
		entityManager = emf.createEntityManager();
	}
	
	public Combat save (Combat entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Combat update (Combat entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Combat remove (Combat entity) {
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	public Combat find (String idValue) {
		return (Combat) entityManager.find(Combat.class, idValue);
	}
	public List<Combat> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
