package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import tn.esprit.entities.Departement;

@Entity
@Table(name="T_ENTREPRISES")
public class Entreprise implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String name;
	private String raisonSocial;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
	private Set<Departement> departements;

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entreprise(int id, String name, String raisonSocial, Set<Departement> departements) {
		super();
		this.id = id;
		this.name = name;
		this.raisonSocial = raisonSocial;
		this.departements = departements;
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

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public Set<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(Set<Departement> departements) {
		this.departements = departements;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", name=" + name + ", raisonSocial=" + raisonSocial + ", departements="
				+ departements + "]";
	}
	
}
