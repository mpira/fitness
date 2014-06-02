package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Guest generated by hbm2java
 */
@Entity
@Table(name = "guest", catalog = "fitnessclub")
public class Guest implements java.io.Serializable {

	private int idPersonne;
	private String numCarte;
	private String dateDebut;
	private int idLicence;

	public Guest() {
	}

	public Guest(int idPersonne, String numCarte, String dateDebut,
			int idLicence) {
		this.idPersonne = idPersonne;
		this.numCarte = numCarte;
		this.dateDebut = dateDebut;
		this.idLicence = idLicence;
	}

	@Id
	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "numCarte", nullable = false, length = 20)
	public String getNumCarte() {
		return this.numCarte;
	}

	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}

	@Column(name = "dateDebut", nullable = false, length = 10)
	public String getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Column(name = "idLicence", nullable = false)
	public int getIdLicence() {
		return this.idLicence;
	}

	public void setIdLicence(int idLicence) {
		this.idLicence = idLicence;
	}

}