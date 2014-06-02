package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EngageId generated by hbm2java
 */
@Embeddable
public class EngageId implements java.io.Serializable {

	private int idLicence;
	private int idPersonne;

	public EngageId() {
	}

	public EngageId(int idLicence, int idPersonne) {
		this.idLicence = idLicence;
		this.idPersonne = idPersonne;
	}

	@Column(name = "idLicence", nullable = false)
	public int getIdLicence() {
		return this.idLicence;
	}

	public void setIdLicence(int idLicence) {
		this.idLicence = idLicence;
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
		if (!(other instanceof EngageId))
			return false;
		EngageId castOther = (EngageId) other;

		return (this.getIdLicence() == castOther.getIdLicence())
				&& (this.getIdPersonne() == castOther.getIdPersonne());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdLicence();
		result = 37 * result + this.getIdPersonne();
		return result;
	}

}
