package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DonneId generated by hbm2java
 */
@Embeddable
public class DonneId implements java.io.Serializable {

	private int idPersonne;
	private int idSession;

	public DonneId() {
	}

	public DonneId(int idPersonne, int idSession) {
		this.idPersonne = idPersonne;
		this.idSession = idSession;
	}

	@Column(name = "idPersonne", nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "idSession", nullable = false)
	public int getIdSession() {
		return this.idSession;
	}

	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DonneId))
			return false;
		DonneId castOther = (DonneId) other;

		return (this.getIdPersonne() == castOther.getIdPersonne())
				&& (this.getIdSession() == castOther.getIdSession());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPersonne();
		result = 37 * result + this.getIdSession();
		return result;
	}

}
