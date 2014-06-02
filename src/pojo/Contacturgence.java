package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Contacturgence generated by hbm2java
 */
@Entity
@Table(name = "contacturgence", catalog = "fitnessclub")
public class Contacturgence implements java.io.Serializable {

	private Integer idContact;
	private String description;
	private String telephone;

	public Contacturgence() {
	}

	public Contacturgence(String description, String telephone) {
		this.description = description;
		this.telephone = telephone;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idContact", unique = true, nullable = false)
	public Integer getIdContact() {
		return this.idContact;
	}

	public void setIdContact(Integer idContact) {
		this.idContact = idContact;
	}

	@Column(name = "description", nullable = false, length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "telephone", nullable = false, length = 10)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}