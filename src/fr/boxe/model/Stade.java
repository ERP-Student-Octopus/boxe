package fr.boxe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stade")
public class Stade implements Serializable {

	@Column(name = "id_stade")
    @Id
    private int id_stade;
	
    @Column(name = "nom")
    private String nom;
    
    @Column(name ="nombre_place")
    private int nombre_place;

	public Stade() {
		
	}

	@Override
	public String toString() {
		return "Stade [id_combattant=" + id_stade + ", nom=" + nom + ", nombre_place=" + nombre_place + "]";
	}

	public int getId_stade() {
		return id_stade;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombre_place() {
		return nombre_place;
	}

	public void setNombre_place(int nombre_place) {
		this.nombre_place = nombre_place;
	}
	
    
}
