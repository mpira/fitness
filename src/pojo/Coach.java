package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Coach generated by hbm2java
 */
@Entity
@Table(name = "coach", catalog = "fitnessclub")
public class Coach implements java.io.Serializable {

	private int idPersonne;
	private String licence;

	public Coach() {
	}

	public Coach(int idPersonne, String licence) {
		this.idPersonne = idPersonne;
		this.licence = licence;
	}

	@Id
	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "licence", nullable = false, length = 50)
	public String getLicence() {
		return this.licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

}
