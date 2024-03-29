package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Profcours generated by hbm2java
 */
@Entity
@Table(name = "profcours", catalog = "fitnessclub")
public class Profcours implements java.io.Serializable {

	private int idPersonne;
	private String specialite;

	public Profcours() {
	}

	public Profcours(int idPersonne, String specialite) {
		this.idPersonne = idPersonne;
		this.specialite = specialite;
	}

	@Id
	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "specialite", nullable = false, length = 50)
	public String getSpecialite() {
		return this.specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

}
