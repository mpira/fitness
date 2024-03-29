package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProposeId generated by hbm2java
 */
@Embeddable
public class ProposeId implements java.io.Serializable {

	private int idCours;
	private int idLicence;

	public ProposeId() {
	}

	public ProposeId(int idCours, int idLicence) {
		this.idCours = idCours;
		this.idLicence = idLicence;
	}

	@Column(name = "idCours", nullable = false)
	public int getIdCours() {
		return this.idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	@Column(name = "idLicence", nullable = false)
	public int getIdLicence() {
		return this.idLicence;
	}

	public void setIdLicence(int idLicence) {
		this.idLicence = idLicence;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProposeId))
			return false;
		ProposeId castOther = (ProposeId) other;

		return (this.getIdCours() == castOther.getIdCours())
				&& (this.getIdLicence() == castOther.getIdLicence());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCours();
		result = 37 * result + this.getIdLicence();
		return result;
	}

}
