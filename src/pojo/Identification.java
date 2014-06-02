package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Identification generated by hbm2java
 */
@Entity
@Table(name = "identification", catalog = "fitnessclub")
public class Identification implements java.io.Serializable {

	private int idPersonne;
	private String login;
	private String password;

	public Identification() {
	}

	public Identification(int idPersonne, String login, String password) {
		this.idPersonne = idPersonne;
		this.login = login;
		this.password = password;
	}

	@Id
	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@Column(name = "login", nullable = false, length = 50)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}