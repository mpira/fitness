package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Propose generated by hbm2java
 */
@Entity
@Table(name = "propose", catalog = "fitnessclub")
public class Propose implements java.io.Serializable {

	private ProposeId id;

	public Propose() {
	}

	public Propose(ProposeId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCours", column = @Column(name = "idCours", nullable = false)),
			@AttributeOverride(name = "idLicence", column = @Column(name = "idLicence", nullable = false)) })
	public ProposeId getId() {
		return this.id;
	}

	public void setId(ProposeId id) {
		this.id = id;
	}

}
