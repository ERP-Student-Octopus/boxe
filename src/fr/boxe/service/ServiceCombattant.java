package fr.boxe.service;

import java.util.List;

import fr.boxe.dao.DaoCombattant;
import fr.boxe.model.Combattant;

public class ServiceCombattant {
	private DaoCombattant daoCombattant = null;
	
	public ServiceCombattant() {
		daoCombattant = new DaoCombattant();
	}
	
	public Combattant save (Combattant entity) {
		return daoCombattant.save(entity);
	}
	public Combattant update (Combattant entity) {
		return daoCombattant.update(entity);
	}
	public Combattant remove (Combattant entity) {
		return daoCombattant.remove(entity);
	}
	public Combattant find (int idValue) {
		return daoCombattant.find(idValue);
	}
	public List<Combattant> findAll() {
		return daoCombattant.findAll();
	}
}