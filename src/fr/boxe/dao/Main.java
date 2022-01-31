package fr.boxe.dao;

import fr.boxe.service.ServiceStade;
import fr.boxe.service.ServiceCombat;
import fr.boxe.service.ServiceCombattant;

import fr.boxe.model.Stade;

import java.util.Date;
import java.util.List;

import fr.boxe.model.Combat;
import fr.boxe.model.Combattant;

public class Main {

	public static void main(String[] args) {
		
		//---------------creation stade-------------------
		//ServiceStade serviceStade = new ServiceStade();
		//Stade stade = new Stade();
		//stade.setNom("Stade 2");
		//stade.setNombre_place(100);
		
		//serviceStade.save(stade);
			//System.out.println("Creation de stade reussi ");
		
		//---------------view stade-------------------
		//ServiceStade serviceStade = new ServiceStade();
		//List<Stade> stades = serviceStade.findAll();
		//if(stades !=null && !stades.isEmpty()) {
		//	for(Stade stade:stades) {
			//	System.out.println(stade.getId_stade() + " - " + stade.getNom());
			//}
		//}
			
		//---------------creation Combattant-------------------
		//ServiceCombattant serviceCombattant = new ServiceCombattant();
		//Combattant combattant = new Combattant();
		//combattant.setPrenom("Row");
		//combattant.setNom("Harpe");
		//combattant.setAge(25);
		//combattant.setSexe("Homme");
			
		//serviceCombattant.save(combattant);
			//System.out.println("Creation de combattant reussi");
		
		//---------------creation Match-------------------
		ServiceCombat serviceCombat = new ServiceCombat();
		ServiceCombattant serviceCombattant = new ServiceCombattant();
		
		Combat combat = new Combat();
		 combat.setDate_combat(new Date());
		
		Combattant combattant1 = new Combattant();
		Combattant combattant1Found = serviceCombattant.find(2);
		
		Combattant combattant2 = new Combattant();
		Combattant combattant2Found = serviceCombattant.find(1);
		
		combat.setCombattant_1(combattant1Found);
		combat.setCombattant_2(combattant2Found);
				
		serviceCombat.save(combat);
		System.out.println("Creation de combat reussi ");
	}

}

