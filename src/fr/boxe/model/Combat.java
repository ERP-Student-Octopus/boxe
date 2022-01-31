package fr.boxe.model;

import java.io.Serializable;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.mapping.Set;

@Entity
@Table (name="combat")
public class Combat implements Serializable{
	
		@Column(name = "id_combat")
	    @Id
	    private int id_combat;
		
		@Temporal(TemporalType.DATE)
		@Column(name ="date_combat")
	    private java.util.Date date_combat = new java.util.Date();
		
		@ManyToOne
	    @JoinColumn(name = "id_combattant_1")
	    private Combattant combattant_1 = new Combattant();
	    
		@ManyToOne
	    @JoinColumn(name = "id_combattant_2")
		 private Combattant combattant_2 = new Combattant();

		public Combat() {
			
		}

		public int getId_combat() {
			return id_combat;
		}

		public void setId_combat(int id_combat) {
			this.id_combat = id_combat;
		}

		
		public java.util.Date getDate_combat() {
			return date_combat;
		}

		public void setDate_combat(java.util.Date date_combat) {
			this.date_combat = date_combat;
		}

		public Combattant getCombattant_1() {
			return combattant_1;
		}

		public void setCombattant_1(Combattant combattant_1) {
			this.combattant_1 = combattant_1;
		}

		public Combattant getCombattant_2() {
			return combattant_2;
		}

		public void setCombattant_2(Combattant combattant_2) {
			this.combattant_2 = combattant_2;
		}


	    
}
