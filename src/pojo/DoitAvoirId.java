package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DoitAvoirId generated by hbm2java
 */
@Embeddable
public class DoitAvoirId implements java.io.Serializable {

	private int idContact;
	private int idPersonne;

	public DoitAvoirId() {
	}

	public DoitAvoirId(int idContact, int idPersonne) {
		this.idContact = idContact;
		this.idPersonne = idPersonne;
	}

	@Column(name = "idContact", nullable = false)
	public int getIdContact() {
		return this.idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
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
		if (!(other instanceof DoitAvoirId))
			return false;
		DoitAvoirId castOther = (DoitAvoirId) other;

		return (this.getIdContact() == castOther.getIdContact())
				&& (this.getIdPersonne() == castOther.getIdPersonne());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdContact();
		result = 37 * result + this.getIdPersonne();
		return result;
	}

}
