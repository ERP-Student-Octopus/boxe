package fr.boxe.service;

import java.util.List;

import fr.boxe.dao.DaoStade;
import fr.boxe.model.Stade;

public class ServiceStade {
	private DaoStade daoStade = null;
	
	public ServiceStade() {
		daoStade = new DaoStade();
	}
	
	public Stade save (Stade entity) {
		return daoStade.save(entity);
	}
	public Stade update (Stade entity) {
		return daoStade.update(entity);
	}
	public Stade remove (Stade entity) {
		return daoStade.remove(entity);
	}
	public Stade find (int idValue) {
		return daoStade.find(idValue);
	}
	public List<Stade> findAll() {
		return daoStade.findAll();
	}
}
