package fr.boxe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="combattant")
public class Combattant implements Serializable {
	
		@Column(name = "id_combattant")
	    @Id
	    private int id_combattant;
		
		@Column(name ="prenom")
	    private String prenom;
		
	    @Column(name = "nom")
	    private String nom;
	    
	    @Column(name = "age")
	    private int age;
	    
	    @Column(name = "sexe")
	    private String sexe;
	    
		public Combattant() {
			
		}

		@Override
		public String toString() {
			return "Combattant [getId_combattant()=" + getId_combattant() + ", getPrenom()=" + getPrenom()
					+ ", getNom()=" + getNom() + ", getAge()=" + getAge() + ", getSexe()=" + getSexe() + "]";
		}

		public Integer getId_combattant() {
			return id_combattant;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getSexe() {
			return sexe;
		}

		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
	    
	    
	    
}
  
