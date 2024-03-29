package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import tn.esprit.entities.*;

@Entity
@Table(name="T_EMPLOYES")
public class Employe implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String email;
	private int isActif;
	private String nom;
	private String prenom;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Departement> Departements;
	
	@OneToOne(mappedBy="employe")
	private Contrat contrat;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="employe")
	private Set<Timesheet> timesheets;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(int id, String email, int isActif, String nom, String prenom, Role role,
			Set<Departement> departements, Contrat contrat, Set<Timesheet> timesheets) {
		super();
		this.id = id;
		this.email = email;
		this.isActif = isActif;
		this.nom = nom;
		this.prenom = prenom;
		this.role = role;
		Departements = departements;
		this.contrat = contrat;
		this.timesheets = timesheets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsActif() {
		return isActif;
	}

	public void setIsActif(int isActif) {
		this.isActif = isActif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Departement> getDepartements() {
		return Departements;
	}

	public void setDepartements(Set<Departement> departements) {
		Departements = departements;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public Set<Timesheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(Set<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", email=" + email + ", isActif=" + isActif + ", nom=" + nom + ", prenom=" + prenom
				+ ", role=" + role + ", Departements=" + Departements + ", contrat=" + contrat + ", timesheets="
				+ timesheets + "]";
	}

}
