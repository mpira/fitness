package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AssisteId generated by hbm2java
 */
@Embeddable
public class AssisteId implements java.io.Serializable {

	private int idCours;
	private int idPersonne;

	public AssisteId() {
	}

	public AssisteId(int idCours, int idPersonne) {
		this.idCours = idCours;
		this.idPersonne = idPersonne;
	}

	@Column(name = "idCours", nullable = false)
	public int getIdCours() {
		return this.idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	@Column(name = "idPersonne", nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AssisteId))
			return false;
		AssisteId castOther = (AssisteId) other;

		return (this.getIdCours() == castOther.getIdCours())
				&& (this.getIdPersonne() == castOther.getIdPersonne());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCours();
		result = 37 * result + this.getIdPersonne();
		return result;
	}

}