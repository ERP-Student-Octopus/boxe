package fr.boxe.service;

import java.util.List;

import fr.boxe.dao.DaoCombat;
import fr.boxe.model.Combat;

public class ServiceCombat {
	private DaoCombat daoCombat = null;
	
	public ServiceCombat() {
		daoCombat = new DaoCombat();
	}
	
	public Combat save (Combat entity) {
		return daoCombat.save(entity);
	}
	public Combat update (Combat entity) {
		return daoCombat.update(entity);
	}
	public Combat remove (Combat entity) {
		return daoCombat.remove(entity);
	}
	public Combat find (String idValue) {
		return daoCombat.find(idValue);
	}
	public List<Combat> findAll() {
		return daoCombat.findAll();
	}
}
