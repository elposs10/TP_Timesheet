package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="T_OUTMISSIONS")
public class MissionExterne extends Mission implements Serializable {
	
	private String emailFacturation;
	private String tauxJournalierMoyen;
	public MissionExterne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MissionExterne(int id, String name, String description, Departement departement, Set<Timesheet> timesheets) {
		super(id, name, description, departement, timesheets);
		// TODO Auto-generated constructor stub
	}
	public MissionExterne(int id, String name, String description, Departement departement, Set<Timesheet> timesheets,
			String emailFacturation, String tauxJournalierMoyen) {
		super(id, name, description, departement, timesheets);
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
	public MissionExterne(String emailFacturation, String tauxJournalierMoyen) {
		super();
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
	public String getEmailFacturation() {
		return emailFacturation;
	}
	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}
	public String getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}
	public void setTauxJournalierMoyen(String tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
	@Override
	public String toString() {
		return "MissionExterne [emailFacturation=" + emailFacturation + ", tauxJournalierMoyen=" + tauxJournalierMoyen
				+ "]";
	}

}
