package tn.esprit.entities;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
import tn.esprit.entities.Employe;

@Entity
@Table(name="T_CONTRATS")
public class Contrat implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reference;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	private long Salaire;
	private String typeContrat;
	
	@OneToOne
	private Employe employe;

	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrat(int reference, Date dateDebut, long salaire, String typeContrat, Employe employe) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		Salaire = salaire;
		this.typeContrat = typeContrat;
		this.employe = employe;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public long getSalaire() {
		return Salaire;
	}

	public void setSalaire(long salaire) {
		Salaire = salaire;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Contrat [reference=" + reference + ", dateDebut=" + dateDebut + ", Salaire=" + Salaire
				+ ", typeContrat=" + typeContrat + ", employe=" + employe + "]";
	}

}
