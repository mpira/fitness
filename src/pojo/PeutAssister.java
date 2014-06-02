package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PeutAssister generated by hbm2java
 */
@Entity
@Table(name = "peut_assister", catalog = "fitnessclub")
public class PeutAssister implements java.io.Serializable {

	private PeutAssisterId id;

	public PeutAssister() {
	}

	public PeutAssister(PeutAssisterId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idCours", column = @Column(name = "idCours", nullable = false)),
			@AttributeOverride(name = "idPersonne", column = @Column(name = "idPersonne", nullable = false)) })
	public PeutAssisterId getId() {
		return this.id;
	}

	public void setId(PeutAssisterId id) {
		this.id = id;
	}

}
