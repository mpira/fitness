package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Membre generated by hbm2java
 */
@Entity
@Table(name = "membre", catalog = "fitnessclub")
public class Membre implements java.io.Serializable {

	private int idPersonne;
	private String numCarteIdentite;
	private String numCompteBank;
	private String typeAbonnement;
	private String medicalStatus;
	private String dateInscription;
	private Integer peuIdPersonne;

	public Membre() {
	}

	public Membre(int idPersonne, String numCarteIdentite,
			String numCompteBank, String typeAbonnement, String medicalStatus,
			String dateInscription) {
		this.idPersonne = idPersonne;
		this.numCarteIdentite = numCarteIdentite;
		this.numCompteBank = numCompteBank;
		this.typeAbonnement = typeAbonnement;
		this.medicalStatus = medicalStatus;
		this.dateInscription = dateInscription;
	}

	public Membre(int idPersonne, String numCarteIdentite,
			String numCompteBank, String typeAbonnement, String medicalStatus,
			String dateInscription, Integer peuIdPersonne) {
		this.idPersonne = idPersonne;
		this.numCarteIdentite = numCarteIdentite;
		this.numCompteBank = numCompteBank;
		this.typeAbonnement = typeAbonnement;
		this.medicalStatus = medicalStatus;
		this.dateInscription = dateInscription;
		this.peuIdPersonne = peuIdPersonne;
	}

	@Id
	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "numCarteIdentite", nullable = false, length = 20)
	public String getNumCarteIdentite() {
		return this.numCarteIdentite;
	}

	public void setNumCarteIdentite(String numCarteIdentite) {
		this.numCarteIdentite = numCarteIdentite;
	}

	@Column(name = "numCompteBank", nullable = false, length = 50)
	public String getNumCompteBank() {
		return this.numCompteBank;
	}

	public void setNumCompteBank(String numCompteBank) {
		this.numCompteBank = numCompteBank;
	}

	@Column(name = "typeAbonnement", nullable = false, length = 10)
	public String getTypeAbonnement() {
		return this.typeAbonnement;
	}

	public void setTypeAbonnement(String typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}

	@Column(name = "medicalStatus", nullable = false, length = 50)
	public String getMedicalStatus() {
		return this.medicalStatus;
	}

	public void setMedicalStatus(String medicalStatus) {
		this.medicalStatus = medicalStatus;
	}

	@Column(name = "DateInscription", nullable = false, length = 10)
	public String getDateInscription() {
		return this.dateInscription;
	}

	public void setDateInscription(String dateInscription) {
		this.dateInscription = dateInscription;
	}

	@Column(name = "Peu_idPersonne")
	public Integer getPeuIdPersonne() {
		return this.peuIdPersonne;
	}

	public void setPeuIdPersonne(Integer peuIdPersonne) {
		this.peuIdPersonne = peuIdPersonne;
	}

}
