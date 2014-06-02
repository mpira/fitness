package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Adresse generated by hbm2java
 */
@Entity
@Table(name = "adresse", catalog = "fitnessclub")
public class Adresse implements java.io.Serializable {

	private Integer idAdresse;
	private String rue;
	private String ville;
	private String province;
	private String zipCode;

	public Adresse() {
	}

	public Adresse(String rue, String ville, String province, String zipCode) {
		this.rue = rue;
		this.ville = ville;
		this.province = province;
		this.zipCode = zipCode;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idAdresse", unique = true, nullable = false)
	public Integer getIdAdresse() {
		return this.idAdresse;
	}

	public void setIdAdresse(Integer idAdresse) {
		this.idAdresse = idAdresse;
	}

	@Column(name = "rue", nullable = false, length = 50)
	public String getRue() {
		return this.rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	@Column(name = "ville", nullable = false, length = 50)
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Column(name = "province", nullable = false, length = 50)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "zipCode", nullable = false, length = 20)
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}