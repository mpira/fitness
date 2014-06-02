package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Horaire generated by hbm2java
 */
@Entity
@Table(name = "horaire", catalog = "fitnessclub")
public class Horaire implements java.io.Serializable {

	private Integer idSession;
	private String heureDebut;
	private String heureFin;
	private String jour;

	public Horaire() {
	}

	public Horaire(String heureDebut, String heureFin, String jour) {
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.jour = jour;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idSession", unique = true, nullable = false)
	public Integer getIdSession() {
		return this.idSession;
	}

	public void setIdSession(Integer idSession) {
		this.idSession = idSession;
	}

	@Column(name = "heureDebut", nullable = false, length = 10)
	public String getHeureDebut() {
		return this.heureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	@Column(name = "heureFin", nullable = false, length = 10)
	public String getHeureFin() {
		return this.heureFin;
	}

	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}

	@Column(name = "jour", nullable = false, length = 10)
	public String getJour() {
		return this.jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

}
