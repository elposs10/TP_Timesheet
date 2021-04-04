package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import tn.esprit.entities.*;

@Entity
@Table(name="T_DEPARTEMENTS")
public class Departement implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String name;
	
	@ManyToMany(mappedBy="Departements", cascade = CascadeType.ALL)
	private Set<Employe> employes;
	
	@ManyToOne
	Entreprise entreprise;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="departement")
	private Set<Mission> Missions;

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(int id, String name, Set<Employe> employes, Entreprise entreprise, Set<Mission> missions) {
		super();
		this.id = id;
		this.name = name;
		this.employes = employes;
		this.entreprise = entreprise;
		Missions = missions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employe> employes) {
		this.employes = employes;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Set<Mission> getMissions() {
		return Missions;
	}

	public void setMissions(Set<Mission> missions) {
		Missions = missions;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", name=" + name + ", employes=" + employes + ", entreprise=" + entreprise
				+ ", Missions=" + Missions + "]";
	}

}
